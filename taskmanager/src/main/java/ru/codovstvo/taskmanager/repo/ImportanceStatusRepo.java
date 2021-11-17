package ru.codovstvo.taskmanager.repo;

import org.springframework.data.repository.CrudRepository;

import ru.codovstvo.taskmanager.entitydb.ImportanceStatus;

public interface ImportanceStatusRepo extends CrudRepository<ImportanceStatus, Long> {  
    ImportanceStatus findByImportanceStatusName(String importanceStatusName);  
}