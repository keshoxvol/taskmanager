package ru.codovstvo.taskmanager.entitydb;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Project {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String projectName;
    
    @ManyToOne
    private Department department;

    @ManyToOne
    private UserEntity manager;

    @ManyToMany(mappedBy = "projectsMembership")
    private Set<UserEntity> memberships;

    @OneToMany(targetEntity = Task.class)
    private Set<Task> tasks;


    public Project(String projectName, Department department){
        this.projectName = projectName;
        this.department = department;
    }

    public Project(){}

}