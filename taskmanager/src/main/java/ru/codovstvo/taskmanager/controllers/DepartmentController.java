package ru.codovstvo.taskmanager.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import ru.codovstvo.taskmanager.entitydb.Company;
import ru.codovstvo.taskmanager.entitydb.Department;
import ru.codovstvo.taskmanager.repo.CompanyRepo;
import ru.codovstvo.taskmanager.repo.DepartmentRepo;

@RestController
@RequestMapping(path = "departments")
public class DepartmentController {
    @Autowired
    public DepartmentRepo departmentRepo;

    @Autowired
    public CompanyRepo companyRepo;

    @GetMapping(value="/all")
    public Iterable<Department> getAllDepartment() {
        Iterable<Department> departments = departmentRepo.findAll();
        return departments;
    }

    @PostMapping(value="add")
    public void addDepartment(@RequestParam(value = "title") String title,
                                @RequestParam(value = "companyid") Long companyId) {
        Optional<Company> optionalCompany = companyRepo.findById(companyId);
        Company company = optionalCompany.get();
        departmentRepo.save(new Department(title, company));
    }

}