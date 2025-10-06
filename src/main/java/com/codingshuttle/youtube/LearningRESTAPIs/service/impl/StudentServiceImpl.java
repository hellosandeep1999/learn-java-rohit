package com.codingshuttle.youtube.LearningRESTAPIs.service.impl;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.helper.ExcelHelper;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
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
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(s -> new StudentDto(s.getId(), s.getName(), s.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public void saveExcelData(MultipartFile file) {
        ExcelHelper excelHelper = new ExcelHelper();
        List<Student> students = excelHelper.excelToStudents(file);

        // Make sure Hibernate treats them as new rows
        for (Student student : students) {
            student.setId(null);
        }

        studentRepository.saveAll(students);
    }

    public Student createStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student newStudent) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if(existingStudent.isPresent()) {
            Student existingStudentData = existingStudent.get();
            existingStudentData.setName(newStudent.getName());
            existingStudentData.setEmail(newStudent.getEmail());
            return studentRepository.save(existingStudentData);
        }
        else{
            throw new RuntimeException("Student not found:");
        }


    }

}
