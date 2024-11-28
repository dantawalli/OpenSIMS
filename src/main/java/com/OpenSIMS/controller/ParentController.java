package com.OpenSIMS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parent")
@PreAuthorize("hasRole('PARENT')")
public class ParentController {

    @GetMapping("/dashboard")
    public ResponseEntity<String> parentDashboard() {
        return ResponseEntity.ok("Welcome to the Parent Dashboard!");
    }

    @GetMapping("/child-progress")
    public ResponseEntity<String> getChildProgress() {
        // Logic to fetch child's progress
        return ResponseEntity.ok("Child's progress data");
    }
}

