package ru.codovstvo.taskmanager.entitydb;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    
    @ManyToOne
    private Department department;

    @ManyToOne
    private Customer manager;

    @ManyToMany(mappedBy = "projectsMembership")
    private Set<Customer> memberships = new HashSet<>();

    @OneToMany(targetEntity = Task.class)
    private Set<Task> tasks = new HashSet<>();


    public Project(String title){
        this.title = title;
    }

    public Project(){}


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
     * @return Department return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * @return Customer return the manager
     */
    public Customer getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(Customer manager) {
        this.manager = manager;
    }

    /**
     * @return Set<Customer> return the memberships
     */
    public Set<Customer> getMemberships() {
        return memberships;
    }

    /**
     * @param memberships the memberships to set
     */
    public void setMemberships(Set<Customer> memberships) {
        this.memberships = memberships;
    }

    /**
     * @return Set<Task> return the tasks
     */
    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * @param tasks the tasks to set
     */
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

}