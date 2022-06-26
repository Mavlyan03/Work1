package com.company.model;

import com.company.service.serviceImpl.CourseService;

import java.util.List;

public class Company {
    private int ID;
    private String name;
    private List<Course> course;

    public int getID() {return ID;}

    public void setID(int ID) {this.ID = ID;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public Company(int ID, String name, List<Course> course) {
        this.ID = ID;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Company{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
