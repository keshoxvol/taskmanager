package ru.codovstvo.taskmanager.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.codovstvo.taskmanager.entitydb.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
    List<UserEntity> findAll();
}