package com.company;

import com.company.model.*;
import com.company.service.serviceImpl.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> student = new ArrayList<Student>(List.of
                (new Student("Sam Norton",22,"Male",180,75),
                new Student("Daniel Adklins",28,"Male",176,64),
                new Student("Dean Winchester",26,"Male",185,77)));
        List<Group> group = new ArrayList<Group>(List.of
                (new Group(27,"Street 7 Avenue",student),
                new Group(32,"Street Beverly-Hills",student),
                new Group(33,"Street Hell-Kitchen",student)));
        List<Teacher> teacher = new ArrayList<Teacher>(List.of
                (new Teacher(35000,"Soft skills","2 years","Muna Aitbekove"),
                 new Teacher(33000,"English lesson","1 year","Semenova Veronika"),
                 new Teacher(36000,"English lesson","3 years","Kunduz Japarova")));
        List<Course> course = new ArrayList<Course>(List.of
                (new Course(2018,"English Zone Kids","English",teacher,group),
                 new Course(2019,"AUCA course","Germany",teacher,group),
                 new Course(2021,"Soft skills","Soft skill",teacher,group)));
        List<Company> company = new ArrayList<Company>(List.of
                (new Company(22,"Peaksoft House",course),
                 new Company(25,"Advance Company",course),
                 new Company(55,"Bairak company",course)));

        CompanyService companyService = new CompanyService();
        CourseService courseService = new CourseService();
        GroupService groupService = new GroupService();
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();

        int number = scanner.nextInt();
        try {
        switch(number) {
            case 1:
                companyService.getCompanyInfo(company);
                break;
            case 2:
                companyService.findCompanyByID(company);
                break;
            case 3:
                companyService.deleteCompanyByName(company);
                break;
            case 4:
                courseService.findByNameOfCourse(course);
                break;
            case 5:
                courseService.findByKindOfCourse(course);
                break;
            case 6:
                courseService.findByYearOfFormation(course);
                break;
            case 7:
                groupService.findByGroupName(group);
                break;
            case 8:
                groupService.findByLocation(group);
                break;
            case 9:
                groupService.findByGroupAmount(group);
                break;
            case 10:
                teacherService.findByName(teacher);
                break;
            case 11:
                teacherService.findBySalary(teacher);
                break;
            case 12:
                teacherService.deleteBySubject(teacher);
                break;
            case 13:
                studentService.findByName(student);
                break;
            case 14:
                studentService.findByAge(student);
                break;
            case 15:
                studentService.findByHeight(student);
                break;
            default: throw new MyException();
        }

        } catch (MyException e) {
            e.getWrongNumber();
        }


    }

}
