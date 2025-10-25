package com.codingshuttle.youtube.LearningRESTAPIs.service;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.springframework.web.multipart.MultipartFile;   // ✅ add this


import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudent();
    void saveExcelData(MultipartFile file);

    Student createStudent(Student student);

    Student updateStudent(Student student);
}
