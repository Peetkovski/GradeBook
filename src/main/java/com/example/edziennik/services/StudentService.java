package com.example.edziennik.services;
import com.example.edziennik.entity.Student;
import com.example.edziennik.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;




    public List<Student> createUserRestService(String studentName){

      List<Student> student = studentRepository.findStudentByStudentName(studentName);


        return student;
    }




}
