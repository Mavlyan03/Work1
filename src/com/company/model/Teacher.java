package com.company.model;


public class Teacher {
  private int salary;
  private String subject;
  private String experience;
  private String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(int salary, String subject, String experience, String name) {
        this.salary = salary;
        this.subject = subject;
        this.experience = experience;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                ", experience='" + experience + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
