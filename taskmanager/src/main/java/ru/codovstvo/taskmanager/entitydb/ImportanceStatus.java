package ru.codovstvo.taskmanager.entitydb;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class ImportanceStatus {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String importanceStatusName;
    
    @OneToMany(targetEntity = Task.class)
    private Set<Task> tasks = new HashSet<>();


    public ImportanceStatus(String importanceStatusName){
        this.importanceStatusName = importanceStatusName;
    }

    public ImportanceStatus(){}

}