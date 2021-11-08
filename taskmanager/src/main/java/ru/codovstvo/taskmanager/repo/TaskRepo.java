package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Status;
import ru.codovstvo.taskmanager.entitydb.Task;

public interface TaskRepo extends CrudRepository<Task, Long> {
    void deleteById(Long id);
    Iterable<Task> findAllByStatus(Status status);
}