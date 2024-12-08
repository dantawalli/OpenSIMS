package com.OpenSIMS.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rollNo;
    private String grade;
    private String section;
    private Date DOB;
    private String address;
    private String phone;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Parent> parent;
    private Date dateOfJoining;

}
