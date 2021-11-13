package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Department;

public interface DepartmentRepo extends CrudRepository<Department, Long> {
    
}