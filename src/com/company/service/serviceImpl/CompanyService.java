package com.company.service.serviceImpl;

import com.company.model.Company;
import com.company.service.CompanyImpl;

import java.util.List;
import java.util.Scanner;


public class CompanyService implements CompanyImpl {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void getCompanyInfo(List<Company> com) {
      System.out.println("All information of all companies");
      com.forEach(System.out::println);
    }

    @Override
    public void findCompanyByID(List<Company> id) {
     System.out.println("Please write ID of company for find it");
     int Id = scanner.nextInt();
     id.stream().filter(x -> x.getID() == Id).forEach(System.out::println);
    }

    @Override
    public void deleteCompanyByName(List<Company> name) {
        System.out.println("Please write name of company for delete it");
       String names = scanner.nextLine();
        System.out.println(name.removeIf(x -> x.getName().equals(names)));

    }
}
