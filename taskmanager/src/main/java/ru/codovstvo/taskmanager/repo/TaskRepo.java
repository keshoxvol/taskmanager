package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ru.codovstvo.taskmanager.entitydb.Task;

public interface TaskRepo extends CrudRepository<Task, Long> {
    Task findById(@Param("id") int id);
    Iterable<Task> findAllByStatus(@Param("status") int status);
}