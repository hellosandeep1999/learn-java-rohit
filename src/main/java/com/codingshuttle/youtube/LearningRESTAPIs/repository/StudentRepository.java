package com.codingshuttle.youtube.LearningRESTAPIs.repository;

import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findFirstByName(String name);
    Optional<Student> findByEmail(String email);
}
