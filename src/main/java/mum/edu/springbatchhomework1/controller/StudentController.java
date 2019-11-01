package mum.edu.springbatchhomework1.controller;

import mum.edu.springbatchhomework1.model.Student;
import mum.edu.springbatchhomework1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value ="/admin/students")
    @Secured("ROLE_ADMIN")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
