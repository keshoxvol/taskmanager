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
public class Status {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String statusName;
    
    @OneToMany(targetEntity = Task.class)
    private Set<Task> tasks = new HashSet<>();


    public Status(String statusName){
        this.statusName = statusName;
    }

    public Status(){}

}

