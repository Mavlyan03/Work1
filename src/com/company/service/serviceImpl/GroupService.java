package com.company.service.serviceImpl;

import com.company.model.Group;
import com.company.service.GroupImpl;

import java.util.List;
import java.util.Scanner;

public class GroupService implements GroupImpl {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void findByGroupAmount(List<Group> amountGroup) {
        System.out.println("You should write amount of group");
        int amount = scanner.nextInt();
        amountGroup.stream().filter(x -> x.getGroupAmount() == amount).forEach(System.out::println);
    }

    @Override
    public void findByLocation(List<Group> locationOfGroup) {
        System.out.println("You should write location of group");
        String location = scanner.nextLine();
        locationOfGroup.stream().filter(x -> x.getLocation().equals(location)).forEach(System.out::println);
    }

    @Override
    public void findByGroupName(List<Group> nameOfGroup) {
        System.out.println("You should write name of group");
        String nameGroup = scanner.nextLine();
        nameOfGroup.stream().filter(x -> x.getNameOfGroup().equals(nameGroup)).forEach(System.out::println);
    }
}
