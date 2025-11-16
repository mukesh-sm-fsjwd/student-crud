package com.mukesh.studentapp.service;


import com.mukesh.studentapp.model.Student;
import com.mukesh.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repo;
    public StudentService(StudentRepository repo) { this.repo = repo; }

    public Student save(Student s) { return repo.save(s); }
    public List<Student> listAll() { return repo.findAll(); }
    public Student get(Long id) { return repo.findById(id).orElse(null); }
    public void delete(Long id) { repo.deleteById(id); }
}

