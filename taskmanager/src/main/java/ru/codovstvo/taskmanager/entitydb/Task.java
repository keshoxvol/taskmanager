package ru.codovstvo.taskmanager.entitydb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Task {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String taskName;

    @ManyToOne
    private User executor;

    @ManyToOne
    private Project project;
    
    @ManyToOne
    private Status status;
    
    @ManyToOne
    private ImportanceStatus importanceStatus;

    // @ManyToMany
    // private Set<Tag> tags = new HashSet<>();

    
    public Task(String taskName, Project project, Status status, ImportanceStatus importanceStatus){
        this.taskName = taskName;
        this.project = project;
        this.status = status;
        this.importanceStatus = importanceStatus;
    }

    public Task(){}

}