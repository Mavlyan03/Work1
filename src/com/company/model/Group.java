package com.company.model;

import java.util.List;

public class Group {
    private int GroupAmount;
    private String location;
    private String nameOfGroup;
    private List<Student> student;

    public String getNameOfGroup() {return nameOfGroup;}

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public int getGroupAmount() {
        return GroupAmount;
    }

    public void setGroupAmount(int GroupAmount) {
        this.GroupAmount = GroupAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Group(int groupAmount, String location, List<Student> student) {
        this.GroupAmount = groupAmount;
        this.location = location;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "GroupAmount=" + GroupAmount +
                ", location='" + location + '\'' +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                ", student=" + student +
                '}';
    }
}
