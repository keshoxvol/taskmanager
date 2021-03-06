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
public class Department {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String departmentName;

    @ManyToOne
    private Company company;

    @ManyToOne
    private UserEntity manager;

    @ManyToMany(mappedBy = "departmentsMembership")
    private Set<UserEntity> memberships;

    @OneToMany(targetEntity = Project.class)
    private Set<Project> projects;

    public Department(String departmentName, Company company){
        this.departmentName = departmentName;
        this.company = company;
    }

    public Department(){}

}