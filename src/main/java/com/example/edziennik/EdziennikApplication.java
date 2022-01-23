package com.example.edziennik;

import com.example.edziennik.entity.Grades;
import com.example.edziennik.entity.Student;
import com.example.edziennik.repository.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class EdziennikApplication {
    @Autowired
    static private GradesRepository gradesRepository;
    public static void main(String[] args) {
        SpringApplication.run(EdziennikApplication.class, args);






    }

}
