package com.codingshuttle.youtube.LearningRESTAPIs.service;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentPageResponse;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.springframework.web.multipart.MultipartFile;   // ✅ add this


import java.util.List;

public interface StudentService {
    StudentPageResponse getAllStudent(int page, int size, String sortBy, String sortDir);
    void saveExcelData(MultipartFile file);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentByName(String name);

}
