package ru.codovstvo.taskmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.codovstvo.taskmanager.entitydb.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
    
}