package com.OpenSIMS.repository;

import com.OpenSIMS.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
