package com.example.edziennik.repository;
import com.example.edziennik.entity.Grades;
import com.example.edziennik.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class GradesRepositoryTest {
    @Autowired
   private GradesRepository gradesRepository;
    LocalDateTime myObj = LocalDateTime.now();

    @Test
    void addMark(){


        Student student1 = new Student();
        student1.setStudentName("Tom");
        student1.setStudentEmail("Piotr@gmail.com");


        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(student1);

        Grades grades = new Grades();
        grades.setMark(2);
        grades.setDescription("Zadanie domowe");
        grades.setStudent(list1);

        gradesRepository.save(grades);
    }

    @Test
    void showAllGrades(){

     List<Grades> gradesList =  gradesRepository.findAll();


        System.out.println(gradesList);
    }

    @Test
    void showAllFiveMarks() {

        System.out.println(gradesRepository.findGradesByMark(5));

    }

}