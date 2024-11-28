package com.OpenSIMS.controller;

import com.OpenSIMS.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/teacher")
@PreAuthorize("hasRole('TEACHER')")
public class TeacherController {

    @GetMapping("/dashboard")
    public ResponseEntity<String> teacherDashboard() {
        return ResponseEntity.ok("Welcome to the Teacher Dashboard!");
    }

    @GetMapping("/students")
    public ResponseEntity<List<User>> getAssignedStudents() {
        // Logic to fetch students assigned to the teacher
        return ResponseEntity.ok(new ArrayList<>());
    }
}

