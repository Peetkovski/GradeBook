package com.example.edziennik.repository;

import com.example.edziennik.entity.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<Grades, Long> {
}
