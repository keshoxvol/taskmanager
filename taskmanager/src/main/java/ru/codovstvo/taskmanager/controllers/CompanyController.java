package ru.codovstvo.taskmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.entitydb.Company;
import ru.codovstvo.taskmanager.repo.CompanyRepo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping(path = "company")
public class CompanyController {
    
    @Autowired
    public CompanyRepo companyRepo;

    @GetMapping(value="/all")
    public Iterable<Company> getAllCompanies() {
        Iterable<Company> companies = companyRepo.findAll();
        return companies;
    }

    @PostMapping(value="add")
    public String addCompany(@RequestParam(value = "title") String title) {
        companyRepo.save(new Company(title));
        return "200";
    }
    
}