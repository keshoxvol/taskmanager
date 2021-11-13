package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Company;

public interface CompanyRepo extends CrudRepository<Company, Long>{
}