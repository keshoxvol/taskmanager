package ru.codovstvo.taskmanager.entitydb;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String username;

    @ManyToMany
    private Set<Role> roles;

    private UserStatus userStatus;

    private String email;
    private String password;

    @OneToMany(targetEntity = Company.class)
    private Set<Company> companyOwner = new HashSet<>();

    @ManyToMany
    private Set<Company> companiesMembership = new HashSet<>();

    @OneToMany(targetEntity = Department.class)
    private Set<Department> departmentsManager = new HashSet<>();

    @ManyToMany
    private Set<Department> departmentsMembership = new HashSet<>();

    @OneToMany(targetEntity = Project.class)
    private Set<Project> projectsManager = new HashSet<>();

    @ManyToMany
    private Set<Project> projectsMembership = new HashSet<>();

    @OneToMany(targetEntity = Task.class)
    private Set<Task> selfTasks = new HashSet<>();

    @OneToMany(targetEntity = Session.class)
    private Set<Session> sessions = new HashSet<>();

    
    // public User(String email, String password) {
    //     this.email = email;
    //     this.password = password;
    // }

    // public User(){}

}