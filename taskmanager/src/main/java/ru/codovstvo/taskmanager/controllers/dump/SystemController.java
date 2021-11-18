package ru.codovstvo.taskmanager.controllers.dump;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/defaultvaluesinStatus")
    public void inStatus(){
		statusRepo.save(new Status("wait"));
        statusRepo.save(new Status("work"));
        statusRepo.save(new Status("done"));
        statusRepo.save(new Status("archive"));
	}

    @GetMapping("/defaultvaluesinImportanceStatus")
    public void inImportanceStatus(){
		importanceStatusRepo.save(new ImportanceStatus("red"));
        importanceStatusRepo.save(new ImportanceStatus("yellow"));
        importanceStatusRepo.save(new ImportanceStatus("green"));
	}
}