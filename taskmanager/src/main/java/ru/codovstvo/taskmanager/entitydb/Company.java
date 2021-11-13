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
public class Company {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    @OneToMany(targetEntity = Department.class)
    private Set<Department> departments = new HashSet<>();

    @ManyToOne
    private Customer owner;

    @ManyToMany(mappedBy = "companiesMembership")
    private Set<Customer> memberships = new HashSet<>();


    public Company(String title){
        this.title = title;
    }

    public Company(){}
    

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
     * @return Set<Department> return the departments
     */
    public Set<Department> getDepartments() {
        return departments;
    }

    /**
     * @param departments the departments to set
     */
    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    /**
     * @return Customer return the owner
     */
    public Customer getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Customer owner) {
        this.owner = owner;
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
