package com.sg.example.repositary;

import com.sg.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringBootJPARepositary extends JpaRepository<Student, Integer> {
}
