package ru.codovstvo.taskmanager.entitydb;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Customer {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToMany
    private Set<Role> roles;

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

    
    public Customer(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Customer(){}


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Set<Company> return the companyOwner
     */
    public Set<Company> getCompanyOwner() {
        return companyOwner;
    }

    /**
     * @param companyOwner the companyOwner to set
     */
    public void setCompanyOwner(Set<Company> companyOwner) {
        this.companyOwner = companyOwner;
    }

    /**
     * @return Set<Company> return the companiesMembership
     */
    public Set<Company> getCompaniesMembership() {
        return companiesMembership;
    }

    /**
     * @param companiesMembership the companiesMembership to set
     */
    public void setCompaniesMembership(Set<Company> companiesMembership) {
        this.companiesMembership = companiesMembership;
    }

    /**
     * @return Set<Department> return the departmentsManager
     */
    public Set<Department> getDepartmentsManager() {
        return departmentsManager;
    }

    /**
     * @param departmentsManager the departmentsManager to set
     */
    public void setDepartmentsManager(Set<Department> departmentsManager) {
        this.departmentsManager = departmentsManager;
    }

    /**
     * @return Set<Department> return the departmentsMembership
     */
    public Set<Department> getDepartmentsMembership() {
        return departmentsMembership;
    }

    /**
     * @param departmentsMembership the departmentsMembership to set
     */
    public void setDepartmentsMembership(Set<Department> departmentsMembership) {
        this.departmentsMembership = departmentsMembership;
    }

    /**
     * @return Set<Project> return the projectsManager
     */
    public Set<Project> getProjectsManager() {
        return projectsManager;
    }

    /**
     * @param projectsManager the projectsManager to set
     */
    public void setProjectsManager(Set<Project> projectsManager) {
        this.projectsManager = projectsManager;
    }

    /**
     * @return Set<Project> return the projectsMembership
     */
    public Set<Project> getProjectsMembership() {
        return projectsMembership;
    }

    /**
     * @param projectsMembership the projectsMembership to set
     */
    public void setProjectsMembership(Set<Project> projectsMembership) {
        this.projectsMembership = projectsMembership;
    }

    /**
     * @return Set<Task> return the selfTasks
     */
    public Set<Task> getSelfTasks() {
        return selfTasks;
    }

    /**
     * @param selfTasks the selfTasks to set
     */
    public void setSelfTasks(Set<Task> selfTasks) {
        this.selfTasks = selfTasks;
    }

    /**
     * @return Set<Session> return the sessions
     */
    public Set<Session> getSessions() {
        return sessions;
    }

    /**
     * @param sessions the sessions to set
     */
    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }


    /**
     * @return Set<Role> return the roles
     */
    public Set<Role> getRoles() {
        return roles;
    }

}