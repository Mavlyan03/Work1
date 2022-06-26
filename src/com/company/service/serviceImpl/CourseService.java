package com.company.service.serviceImpl;

import com.company.model.Course;
import com.company.service.CourseImpl;

import java.util.List;
import java.util.Scanner;

public class CourseService implements CourseImpl {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void findByYearOfFormation(List<Course> year) {
        System.out.println("You should write year of formation of course");
        int data = scanner.nextInt();
        year.stream().filter(x -> x.getYearOfFormation() == data).forEach(System.out::println);
        for (Course years : year) {
            if (data != years.getYearOfFormation()) {
                System.out.println("We don't have a company with this is year of formation");
            }
        }
    }

    @Override
    public void findByKindOfCourse(List<Course> kindOfCourse) {
        System.out.println("You should write kind of course");
        String kind = scanner.nextLine();
        kindOfCourse.stream().filter(x -> x.getKindOfCourse().equals(kind)).forEach(System.out::println);
    }

    @Override
    public void findByNameOfCourse(List<Course> nameOfCourse) {
        System.out.println("You should write name of course");
        String courseName = scanner.nextLine();
        nameOfCourse.stream().filter(x -> x.getNameOfCourse().equals(courseName)).forEach(System.out::println);

    }
}
