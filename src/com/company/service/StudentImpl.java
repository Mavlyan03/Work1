package com.company.service;

import com.company.model.Student;

import java.util.List;

public interface StudentImpl {

    void findByName(List<Student> nameOfStudent);

    void findByAge(List<Student> ageOfStudent);

    void findByHeight(List<Student> heightOfStudent);




}
