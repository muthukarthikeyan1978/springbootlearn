package com.sg.example.controller;

import com.sg.example.model.Student;
import com.sg.example.service.SpringBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringBootController {

    @Autowired
    private SpringBootService service;
    @GetMapping("/hi")
    public String sayHello(){
        return "SpringBoot Learning.........";
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return service.getAllStudents();
    }


    @PostMapping("/students")
    public List<Student> saveStudent(@RequestBody Student student){
        System.out.println("start saving student ...."+student);
        return service.saveStudent(student);

    }

}
