package com.company.service;

import com.company.model.Teacher;

import java.util.List;

public interface TeacherImpl {

    void findBySalary(List<Teacher> salaryOfTeacher);

    void findByName(List<Teacher> nameOfTeacher);

    void deleteBySubject(List<Teacher> subject);
}
