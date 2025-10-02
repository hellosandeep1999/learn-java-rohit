package com.codingshuttle.youtube.LearningRESTAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private Integer id;
    private String name;
    private String email;
}

