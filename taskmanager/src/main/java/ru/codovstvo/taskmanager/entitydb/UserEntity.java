package ru.codovstvo.taskmanager.entitydb;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String username;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    private String email;
    private String password;

    @OneToMany(targetEntity = Company.class)
    private Set<Company> companyOwner;

    @ManyToMany
    private Set<Company> companiesMembership;

    @OneToMany(targetEntity = Department.class)
    private Set<Department> departmentsManager;

    @ManyToMany
    private Set<Department> departmentsMembership;

    @OneToMany(targetEntity = Project.class)
    private Set<Project> projectsManager;

    @ManyToMany
    private Set<Project> projectsMembership;

    @OneToMany(targetEntity = Task.class)
    private Set<Task> selfTasks;

    @OneToMany(targetEntity = Session.class)
    private Set<Session> sessions;

    public UserEntity(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserEntity(){}

}