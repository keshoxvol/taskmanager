package ru.codovstvo.taskmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.entitydb.ImportanceStatus;
import ru.codovstvo.taskmanager.repo.ImportanceStatusRepo;

@RestController
@RequestMapping(path = "importancestatus")
public class ImportanceStatusController {
    @Autowired
    ImportanceStatusRepo importanceStatusRepo;

    @GetMapping("/all")
    public Iterable<ImportanceStatus> getAllStatus(){
        Iterable<ImportanceStatus> importanseStatuses = importanceStatusRepo.findAll();
        return importanseStatuses;
    }
}