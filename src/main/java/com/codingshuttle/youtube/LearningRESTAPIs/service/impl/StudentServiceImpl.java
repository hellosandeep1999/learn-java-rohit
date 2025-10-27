package com.codingshuttle.youtube.LearningRESTAPIs.service.impl;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentPageResponse;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.exception.StudentNotFoundException;
import com.codingshuttle.youtube.LearningRESTAPIs.helper.ExcelHelper;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentPageResponse getAllStudent(int page, int size, String sortBy, String sortDir) {

        List<String> allowedSortFields = List.of("id", "name", "email");
        if (!allowedSortFields.contains(sortBy.toLowerCase())) {
            throw new IllegalArgumentException("Invalid sort field: " + sortBy);
        }

        Sort sort = sortDir.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Student> studentPage = studentRepository.findAll(pageable);

        List<StudentDto> studentDtos = studentPage.getContent().stream()
                .map(s -> new StudentDto(s.getId(), s.getName(), s.getEmail()))
                .collect(Collectors.toList());

        return new StudentPageResponse(
                studentDtos,
                studentPage.getNumber(),
                studentPage.getTotalPages(),
                studentPage.getTotalElements(),
                sortBy,
                sortDir
        );
    }

    @Override
    public void saveExcelData(MultipartFile file) {
        ExcelHelper excelHelper = new ExcelHelper();
        List<Student> students = excelHelper.excelToStudents(file);

        for (Student student : students) {
            student.setId(null);
        }

        studentRepository.saveAll(students);
    }

    public Student createStudent(Student student) {

        studentRepository.findByEmail(student.getEmail()).ifPresent(s -> {
            throw new IllegalArgumentException("Student with this email already exists: " + student.getEmail());
        });

        return  studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student newStudent) {
       if(newStudent.getId() == null) {
           throw new IllegalArgumentException("Please provide student id in request body");
       }
        Student existingStudent = studentRepository.findById(newStudent.getId())
                .orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + newStudent.getId()));

        studentRepository.findByEmail(newStudent.getEmail()).ifPresent(otherStudent -> {
            if (!otherStudent.getId().equals(existingStudent.getId())) {
                throw new IllegalArgumentException(
                        "Email already in use by another student: " + newStudent.getEmail());
            }
        });

        existingStudent.setName(newStudent.getName());
        existingStudent.setEmail(newStudent.getEmail());

        return studentRepository.save(existingStudent);
    }

    @Override
    public Student getStudentByName(String name) {
        return studentRepository.findFirstByName(name)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with name: " + name));
    }


}
