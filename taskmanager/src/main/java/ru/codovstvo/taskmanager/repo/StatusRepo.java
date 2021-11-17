package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Status;

public interface StatusRepo extends CrudRepository<Status, Long> {
    Status findByStatusName(String statusName);
}