package com.codingshuttle.youtube.LearningRESTAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentPageResponse {
    private List<StudentDto> students;
    private int currentPage;
    private int totalPages;
    private long totalElements;
    private String sortBy;
    private String sortDirection;
}
