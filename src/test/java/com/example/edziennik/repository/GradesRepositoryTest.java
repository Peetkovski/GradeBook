package com.example.edziennik.repository;
import com.example.edziennik.entity.Grades;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;

@SpringBootTest
class GradesRepositoryTest {
    @Autowired
   private GradesRepository gradesRepository;
    LocalDateTime myObj = LocalDateTime.now();

    @Test
    void addMark(){



        Grades grades = Grades.builder()
                .Mark(6)
                .Date(String.valueOf(myObj))
                .Descpription("Słówka")
                .build();

        gradesRepository.save(grades);
    }
}