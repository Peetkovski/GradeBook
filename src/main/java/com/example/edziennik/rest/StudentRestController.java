package com.example.edziennik.rest;

import com.example.edziennik.entity.Student;
import com.example.edziennik.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{studentName}")
    private List<Student> getStudentInfo(@PathVariable("studentName")String studentName){

       List<Student> studentList = studentService.createUserRestService(studentName);


        return studentList;
    }
}
