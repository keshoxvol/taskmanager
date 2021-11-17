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
public class Department {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToOne
    private Company company;

    @ManyToOne
    private Customer manager;

    @ManyToMany(mappedBy = "departmentsMembership")
    private Set<Customer> memberships = new HashSet<>();

    @OneToMany(targetEntity = Project.class)
    private Set<Project> projects = new HashSet<>();

    public Department(String title, Company company){
        this.title = title;
        this.company = company;
    }

    public Department(){}


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
     * @return Set<Project> return the projects
     */
    public Set<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }


    /**
     * @return Company return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
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

}