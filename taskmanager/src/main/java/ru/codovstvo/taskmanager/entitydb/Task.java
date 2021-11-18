package ru.codovstvo.taskmanager.entitydb;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    private UserEntity executor;

    @ManyToOne
    private Project project;
    
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    
    @Enumerated(EnumType.STRING)
    private TaskImportanceStatus importanceStatus;

    // @ManyToMany
    // private Set<Tag> tags = new HashSet<>();

    
    public Task(String taskName, Project project, TaskStatus status, TaskImportanceStatus importanceStatus){
        this.taskName = taskName;
        this.project = project;
        this.status = status;
        this.importanceStatus = importanceStatus;
    }

    public Task(){}

}