package ru.codovstvo.taskmanager.entitydb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ImportanceStatus {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String title;
    
    @OneToMany(targetEntity = Task.class)
    private List<Task> tasksInImportanceStatusTable = new ArrayList<>();

    public ImportanceStatus(String title){
        this.title = title;
    }

    public ImportanceStatus(){}
}