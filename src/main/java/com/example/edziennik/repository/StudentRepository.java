package com.example.edziennik.repository;

import com.example.edziennik.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findStudentByStudentName(String name);
    List<Student> findStudentByStudentEmail(String email);
}
