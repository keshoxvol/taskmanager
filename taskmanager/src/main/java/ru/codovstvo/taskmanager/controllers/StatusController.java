package ru.codovstvo.taskmanager.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.codovstvo.taskmanager.repo.StatusRepo;
import ru.codovstvo.taskmanager.entitydb.Status;

@RestController
@RequestMapping(path = "status")
public class StatusController {
    @Autowired
	private StatusRepo statusRepo;

    @GetMapping("/getall")
    public Iterable<Status> getAllStatus(){
        Iterable<Status> statuses = statusRepo.findAll();
        return statuses;
    }
}