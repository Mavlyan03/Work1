package com.company.service;

import com.company.model.Course;

import java.util.List;

public interface CourseImpl {

    void findByYearOfFormation(List<Course> year);

    void findByKindOfCourse(List<Course> kindOfCourse);

   void findByNameOfCourse(List<Course> nameOfCourse);



}
