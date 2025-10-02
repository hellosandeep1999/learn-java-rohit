package com.codingshuttle.youtube.LearningRESTAPIs.helper;

import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelHelper {

    public List<Student> excelToStudents(MultipartFile file) {
        try {
            List<Student> students = new ArrayList<>();
            InputStream is = file.getInputStream();
            Workbook workbook = WorkbookFactory.create(is);
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // skip header row
                Row row = sheet.getRow(i);
                if (row == null) continue;

                Student s = new Student();

                if (row.getCell(0) != null) {
                    s.setId((int) row.getCell(0).getNumericCellValue());
                }
                if (row.getCell(1) != null) {
                    s.setName(row.getCell(1).getStringCellValue());
                }
                if (row.getCell(2) != null) {
                    s.setEmail(row.getCell(2).getStringCellValue());
                }

                students.add(s);
            }
            workbook.close();
            return students;

        } catch (Exception e) {
            throw new RuntimeException("Failed to parse Excel file: " + e.getMessage());
        }
    }
}
