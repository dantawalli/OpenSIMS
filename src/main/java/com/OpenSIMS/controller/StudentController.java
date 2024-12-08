package com.OpenSIMS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @GetMapping("/dashboard")
    public ResponseEntity<String> studentDashboard() {
        return ResponseEntity.ok("Welcome to the Student Dashboard!");
    }

    @GetMapping("/courses")
    public ResponseEntity<List<String>> getEnrolledCourses() {
        // Logic to fetch enrolled courses
        return ResponseEntity.ok(new ArrayList<>());
    }
}

