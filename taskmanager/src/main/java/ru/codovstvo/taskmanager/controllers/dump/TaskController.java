package ru.codovstvo.taskmanager.controllers.dump;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.entitydb.ImportanceStatus;
import ru.codovstvo.taskmanager.entitydb.Project;
import ru.codovstvo.taskmanager.entitydb.Status;
import ru.codovstvo.taskmanager.entitydb.Task;
import ru.codovstvo.taskmanager.repo.ImportanceStatusRepo;
import ru.codovstvo.taskmanager.repo.ProjectRepo;
import ru.codovstvo.taskmanager.repo.StatusRepo;
import ru.codovstvo.taskmanager.repo.TaskRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "/task")
public class TaskController {
    @Autowired
	private TaskRepo taskRepo;
	
	@Autowired
	private StatusRepo statusRepo;
	
	@Autowired
	private ProjectRepo projectRepo;

	@Autowired
	private ImportanceStatusRepo importanceStatusRepo;

	// @PostMapping("/add")
	// public String addTask(@RequestParam(value = "title") String title,
	// 					@RequestParam(value = "status", defaultValue = "wait") String strStatus,
	// 					@RequestParam(value = "importancestatus", defaultValue = "green") String strImportanceStatus,
	// 					@RequestParam(value = "project") String strProject) {
	// 	Project project = projectRepo.findByTitle(strProject);
	// 	Status status = statusRepo.findByTitle(strStatus);
	// 	ImportanceStatus importanceStatus = importanceStatusRepo.findByTitle(strImportanceStatus);

	// 	if(project == null || status == null || importanceStatus == null){
	// 		return "Status not found, task ignored";
	// 	} else {
	// 		taskRepo.save(new Task(title, project, status, importanceStatus));
	// 		return "200";
	// 	}
	// }

	@PostMapping("/deleteall")
	public void delAlltasks(){
		taskRepo.deleteAll();
	}
	
	@PostMapping("/deletebyid")
	public void deletebyid(@RequestParam(value = "id") Long id){
		taskRepo.deleteById(id);
	}

    @GetMapping("/all")
	public Iterable<Task> getAllTask(){
		Iterable<Task> tasks = taskRepo.findAll();
		return tasks;
	}

// 	@GetMapping("/bystatus")
// 	public Iterable<Task> getByStatus(@RequestParam(value = "status") String title){
// 		Status status = statusRepo.findByTitle(title);
// 		Iterable<Task> tasks = taskRepo.findAllByStatus(status);
// 		return tasks;
// 	}

// 	@GetMapping("/byimportancestatus")
// 	public Iterable<Task> getByImportanceStatus(@RequestParam(value = "importancestatus") String title){
// 		ImportanceStatus importanceStatus = importanceStatusRepo.findByTitle(title);
// 		Iterable<Task> tasks = taskRepo.findAllByImportanceStatus(importanceStatus);
// 		return tasks;
// 	}
}