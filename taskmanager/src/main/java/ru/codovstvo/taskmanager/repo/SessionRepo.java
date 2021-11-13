package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Session;

public interface SessionRepo extends CrudRepository<Session, Long> {
    
}