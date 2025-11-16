package com.mukesh.studentapp.controller;

import com.mukesh.studentapp.model.Student;
import com.mukesh.studentapp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service) { this.service = service; }

    @GetMapping("/")
    public String home(Model m) {
        m.addAttribute("students", service.listAll());
        return "index";
    }

    @GetMapping("/student/new")
    public String createForm(Model m) {
        m.addAttribute("student", new Student());
        return "student_form";
    }

    @PostMapping("/student/save")
    public String save(Student student) {
        service.save(student);
        return "redirect:/";
    }

    @GetMapping("/student/edit/{id}")
    public String edit(@PathVariable Long id, Model m) {
        m.addAttribute("student", service.get(id));
        return "student_form";
    }

    @GetMapping("/student/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }
}

