package com.luv2code.cruddemo.service;

import com.luv2code.cruddemo.entity.Student;
import java.util.List;

public interface StudentService {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
    void update(Student theStudent);
    void deleteById(Integer id);
}
