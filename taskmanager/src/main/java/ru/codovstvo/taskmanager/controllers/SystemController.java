package ru.codovstvo.taskmanager.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.codovstvo.taskmanager.entitydb.ImportanceStatus;
import ru.codovstvo.taskmanager.entitydb.Status;
import ru.codovstvo.taskmanager.repo.ImportanceStatusRepo;
import ru.codovstvo.taskmanager.repo.StatusRepo;

@RestController
@RequestMapping(path = "/sys")
public class SystemController {
    @Autowired
	StatusRepo statusRepo;

    @Autowired
    ImportanceStatusRepo importanceStatusRepo;

    @PostMapping("/defaultvaluesinStatus")
    public void inStatus(){
		statusRepo.save(new Status("wait"));
        statusRepo.save(new Status("work"));
        statusRepo.save(new Status("done"));
        statusRepo.save(new Status("archive"));
	}

    @PostMapping("/defaultvaluesinImportanceStatus")
    public void inImportanceStatus(){
		importanceStatusRepo.save(new ImportanceStatus("red"));
        importanceStatusRepo.save(new ImportanceStatus("yellow"));
        importanceStatusRepo.save(new ImportanceStatus("green"));
	}
}