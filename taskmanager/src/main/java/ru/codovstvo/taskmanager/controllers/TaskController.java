// package ru.codovstvo.taskmanager.controllers;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import ru.codovstvo.taskmanager.entitydb.Task;
// import ru.codovstvo.taskmanager.repo.TaskRepo;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;

// @RestController
// public class TaskController {
//     @Autowired
// 	private TaskRepo taskRepo;

// 	// @PostMapping("/addtask")
// 	// public void addTask(@RequestParam(value = "title") String title,
// 	// 					@RequestParam(value = "tag") String tag,
// 	// 					@RequestParam(value = "description") String description) {
// 	// 	taskRepo.save(new Task(title, tag, description));
// 	// }


//     @GetMapping("/gettasks")
// 	public Iterable<Task> getAllTask(){
// 		Iterable<Task> tasks = taskRepo.findAll();
// 		return tasks;
// 	}

// 	@GetMapping("/getbystatus")
// 	public Iterable<Task> getByStatus(@RequestParam(value = "status") int status){
// 		Iterable<Task> tasks = taskRepo.findAllByStatus(status);
// 		return tasks;
// 	}
// }