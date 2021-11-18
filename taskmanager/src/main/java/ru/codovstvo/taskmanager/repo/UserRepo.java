package ru.codovstvo.taskmanager.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
    List<UserEntity> findAll();
}