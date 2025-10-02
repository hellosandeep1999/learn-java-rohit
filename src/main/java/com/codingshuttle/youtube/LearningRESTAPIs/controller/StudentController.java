package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class StudentController {



    private final StudentService studentService;

    public StudentController( StudentService studentService) {
        this.studentService = studentService;
    }

     @GetMapping("/student-list")
      public List<StudentDto> getStudentList() {
        return studentService.getAllStudent();
     }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        studentService.saveExcelData(file);
        return ResponseEntity.ok("Uploaded file: " + file.getOriginalFilename());
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

}
