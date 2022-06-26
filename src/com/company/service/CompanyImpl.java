package com.company.service;

import com.company.model.Company;

import java.util.List;

public interface CompanyImpl{

    void getCompanyInfo(List<Company> com);

    void findCompanyByID(List<Company> id);

    void deleteCompanyByName(List<Company> name);





}
