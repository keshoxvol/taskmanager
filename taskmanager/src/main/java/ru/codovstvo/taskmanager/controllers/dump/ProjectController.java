package ru.codovstvo.taskmanager.controllers.dump;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.entitydb.Department;
import ru.codovstvo.taskmanager.entitydb.Project;
import ru.codovstvo.taskmanager.repo.DepartmentRepo;
import ru.codovstvo.taskmanager.repo.ProjectRepo;

@RestController
@RequestMapping(path = "project")
public class ProjectController {
    @Autowired
    public ProjectRepo projectRepo;

    @Autowired
    public DepartmentRepo departmentRepo;

    @GetMapping(value="/all")
    public Iterable<Project> getAllProject() {
        Iterable<Project> projects = projectRepo.findAll();
        return projects;
    }

    @PostMapping(value="add")
    public void addDepartment(@RequestParam(value = "title") String title,
                                @RequestParam(value = "departmentid") Long departmentId) {
        Optional<Department> optionalDepartment = departmentRepo.findById(departmentId);
        Department department = optionalDepartment.get();
        projectRepo.save(new Project(title, department));
    }
    
}