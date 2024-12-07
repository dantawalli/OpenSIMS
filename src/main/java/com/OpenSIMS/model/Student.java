package com.OpenSIMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Student extends User{
    private String rollNo;
    private String grade;
    private String section;
    private Date DOB;
    private String address;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "father_id")
    private Parent father;
    @ManyToOne
    @JoinColumn(name = "mother_id")
    private Parent mother;
    private Date dateOfJoining;

}
