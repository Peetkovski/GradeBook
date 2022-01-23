package com.example.edziennik.repository;

import com.example.edziennik.entity.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface GradesRepository extends JpaRepository<Grades,Long> {


    List<Grades> findGradesByMark(Integer mark);
}
