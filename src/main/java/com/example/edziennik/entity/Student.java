package com.example.edziennik.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;
    private String studentName;
    private String studentSurname;
    private Integer studentAge;
    private String studentAddress;
    private String studentApartment;
    private String postCode;
    private String phoneNumber;
    private String studentEmail;

}
