package com.example.edziennik.repository;

import com.example.edziennik.entity.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @DisplayName("Add Student Informations")

    @Test
    void addStudentInfo(){
        Student student =
                Student.builder()
                        .studentName("Piotrek")
                        .studentSurname("Gapiński")
                        .studentAge(17)
                        .studentAddress("Jantarowa")
                        .phoneNumber("123456789")
                        .studentEmail("Peet@gmail.com")
                        .studentApartment("12")
                        .build();
        studentRepository.save(student);
    }

    @Test
    @DisplayName("Show all students")
    void showStudents(){
       List<Student> student =  studentRepository.findAll();

        System.out.println(student);
    }



    @Test
    @DisplayName("Show Student By Name")
    void ShowStudentByName(){
        List<Student> student =  studentRepository.findStudentByStudentName("Piotr");
        System.out.println(student);
    }

    @Test
    void notAddStudentInfo(){
        Student student =
                Student.builder()
                        .studentName("Piotrek")
                        .studentSurname("Gapiński")
                        .studentAge(17)
                        .studentAddress("Jantarowa")
                        .phoneNumber("123456789")
                        .studentEmail("Peet@gmail.com")
                        .studentApartment("12")
                        .build();

    }





}