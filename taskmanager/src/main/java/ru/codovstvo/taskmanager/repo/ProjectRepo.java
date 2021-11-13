package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Project;

public interface ProjectRepo extends CrudRepository<Project, Long>{
    Project findByTitle(String title);
}
