package ru.codovstvo.taskmanager.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.User;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);
    List<User> findAll();
}