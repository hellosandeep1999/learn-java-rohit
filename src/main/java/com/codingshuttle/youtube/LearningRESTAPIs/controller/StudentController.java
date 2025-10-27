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
    public ResponseEntity<?> getStudentList(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir
    ) {
        return ResponseEntity.ok(studentService.getAllStudent(page, size, sortBy, sortDir));
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

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("/student")
    public Student getStudentByName(@RequestParam String name) {
        return studentService.getStudentByName(name);
    }


}
