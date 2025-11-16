package com.mukesh.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mukesh.studentapp.model.Student;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByRollNo(String rollNo);
}
