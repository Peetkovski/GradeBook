package com.example.edziennik.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Grades {

    @Id
    @GeneratedValue()
    private Long Id;
    private Integer Mark;
    private String Descpription;
    private String Date;

}
