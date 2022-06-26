package com.company.model;

import java.util.List;

public class Course {
    private int yearOfFormation;
    private String nameOfCourse;
    private String kindOfCourse;
    private List<Teacher> teacher;
    private List<Group> group;

    public int getYearOfFormation() {
        return yearOfFormation;
    }

    public void setYearOfFormation(int yearOfFormation) {
        this.yearOfFormation = yearOfFormation;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getKindOfCourse() {
        return kindOfCourse;
    }

    public void setKindOfCourse(String kindOfCourse) {
        this.kindOfCourse = kindOfCourse;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public Course(int yearOfFormation, String nameOfCourse, String kindOfCourse, List<Teacher> teacher, List<Group> group) {
        this.yearOfFormation = yearOfFormation;
        this.nameOfCourse = nameOfCourse;
        this.kindOfCourse = kindOfCourse;
        this.teacher = teacher;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Course{" +
                "yearOfFormation=" + yearOfFormation +
                ", nameOfCourse='" + nameOfCourse + '\'' +
                ", kindOfCourse='" + kindOfCourse + '\'' +
                ", teacher=" + teacher +
                ", group=" + group +
                '}';
    }
}
