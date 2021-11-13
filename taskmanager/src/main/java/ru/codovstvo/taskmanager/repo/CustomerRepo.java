package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}