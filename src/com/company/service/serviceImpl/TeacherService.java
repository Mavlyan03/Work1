package com.company.service.serviceImpl;

import com.company.model.Teacher;
import com.company.service.TeacherImpl;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements TeacherImpl {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void findBySalary(List<Teacher> salaryOfTeacher) {
        System.out.println("You should write salary of teacher");
        int salary = scanner.nextInt();
        salaryOfTeacher.stream().filter(x -> x.getSalary() == salary).forEach(System.out::println);
    }

    @Override
    public void findByName(List<Teacher> nameOfTeacher) {
        System.out.println("You should write name of teacher");
        String teacherName = scanner.nextLine();
        nameOfTeacher.stream().filter(x -> x.getName().equals(teacherName)).forEach(System.out::println);
    }

    @Override
    public void deleteBySubject(List<Teacher> subject) {
        System.out.println("You should write subject of teacher");
        String teacherSubject = scanner.nextLine();
        System.out.println(subject.removeIf(x -> x.getSubject().equals(teacherSubject)));
    }
}
