package com.sg.example.service;

import com.sg.example.model.Student;
import com.sg.example.repositary.SpringBootJPARepositary;
import com.sg.example.repositary.SpringBootRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringBootService {

    @Autowired
    private SpringBootJPARepositary springBootJPARepositary;

    public List<Student> getAllStudents() {
        return springBootJPARepositary.findAll();
    }

    public List<Student> saveStudent(Student student) {
        springBootJPARepositary.save(student);
        return getAllStudents();
    }

}
