package ru.codovstvo.taskmanager.controllers.dump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.entitydb.UserEntity;
import ru.codovstvo.taskmanager.repo.UserRepo;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "all")
    public Iterable<UserEntity> getAllCustomer(){
        Iterable<UserEntity> customers = userRepo.findAll();
        return customers;
    }
    
}