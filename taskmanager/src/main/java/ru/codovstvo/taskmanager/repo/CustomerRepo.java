package ru.codovstvo.taskmanager.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    Customer findByTitle(String title);
    List<Customer> findAll();
}