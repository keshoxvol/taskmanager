package ru.codovstvo.taskmanager.controllers;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.entitydb.Company;
import ru.codovstvo.taskmanager.entitydb.Customer;
import ru.codovstvo.taskmanager.entitydb.Department;
import ru.codovstvo.taskmanager.entitydb.Project;
import ru.codovstvo.taskmanager.entitydb.Task;
import ru.codovstvo.taskmanager.repo.CustomerRepo;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(value = "/registration")
    public void addCustomer(@RequestParam(value = "email") String email,
                            @RequestParam(value = "password") String password){
        Customer customer = new Customer(email, password);
        customerRepo.save(customer);
    }

    @GetMapping(value = "all")
    public Iterable<Customer> getAllCustomer(){
        Iterable<Customer> customers = customerRepo.findAll();
        return customers;
    }

    @GetMapping(value = "/getcompaniesbyuserid")
    public Set<Company> getCompaniesByUserId(@RequestParam(value = "userid") Long userid){
        Optional<Customer> optionalCustomer = customerRepo.findById(userid);
        Customer customer = optionalCustomer.get();
        Set<Company> companies = customer.getCompaniesMembership();
        return companies;
    }

    @GetMapping(value = "/getdepartmentsbyuserid")
    public Set<Department> getDepartmentsByUserId(@RequestParam(value = "userid") Long userid){
        Optional<Customer> optionalCustomer = customerRepo.findById(userid);
        Customer customer = optionalCustomer.get();
        Set<Department> departments = customer.getDepartmentsMembership();
        return departments;
    }

    @GetMapping(value = "/getprojectsbyuserid")
    public Set<Project> getProjectsByUserId(@RequestParam(value = "userid") Long userid){
        Optional<Customer> optionalCustomer = customerRepo.findById(userid);
        Customer customer = optionalCustomer.get();
        Set<Project> projects = customer.getProjectsMembership();
        return projects;
    }

    @GetMapping(value = "/gettaskssbyuserid")
    public Set<Task> getTasksByUserId(@RequestParam(value = "userid") Long userid){
        Optional<Customer> optionalCustomer = customerRepo.findById(userid);
        Customer customer = optionalCustomer.get();
        Set<Task> tasks = customer.getSelfTasks();
        return tasks;
    }
    
}