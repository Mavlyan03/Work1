package com.company.service;

import com.company.model.Group;

import java.util.List;

public interface GroupImpl {

    void findByGroupAmount(List<Group> amountGroup);

    void findByLocation(List<Group> locationOfGroup);

    void findByGroupName(List<Group> nameOfGroup);
}
