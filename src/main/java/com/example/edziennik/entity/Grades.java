package com.example.edziennik.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Grades {

    @Id
    @GeneratedValue()
    private Long grade_Id;
    private Integer mark;
    private String description;
    private String date;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="student")
    private List<Student> student;


}
