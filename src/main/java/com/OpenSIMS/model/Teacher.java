package com.OpenSIMS.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User {
    private String teacherId;
    private String qualification;
    private Date DOB;
    private String gender;
    private String address;
    private String phone;
    private Date dateOfJoining;
}
