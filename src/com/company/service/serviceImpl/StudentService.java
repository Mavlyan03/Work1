package com.company.service.serviceImpl;

import com.company.model.Student;
import com.company.service.StudentImpl;

import java.util.List;
import java.util.Scanner;

public class StudentService implements StudentImpl {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void findByName(List<Student> nameOfStudent) {
        System.out.println("You should write name of student");
        String name = scanner.nextLine();
        nameOfStudent.stream().filter(x -> x.getName().equals(name)).forEach(System.out::println);
    }

    @Override
    public void findByAge(List<Student> ageOfStudent) {
        System.out.println("You should write age of student");
        int age = scanner.nextInt();
        ageOfStudent.stream().filter(x -> x.getAge() == age).forEach(System.out::println);
    }

    @Override
    public void findByHeight(List<Student> heightOfStudent) {
        System.out.println("You should write height of student");
        int height = scanner.nextInt();
        heightOfStudent.stream().filter(x -> x.getHeight() == height).forEach(System.out::println);
    }
}
