package com.sg.example.repositary;

import com.sg.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpringBootRepositary {

    private List<Student> studentList=new ArrayList<>();
    public List<Student> getAllStudent() {
        studentList.add(new Student(101,"Karthikeyan","SpringBoot"));
        studentList.add(new Student(102,"Sarvanan","SpringBootSecurity"));
        studentList.add(new Student(103,"Sarvanan","SpringBootSecurity"));
        return studentList;
    }
}
