package ru.codovstvo.taskmanager.entitydb;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//ROLE_USER
//ROLE_ADMIN

@Entity
public class Role {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "roles")
    private Set<Customer> customers = new HashSet<>();


    public Role(Long id,String title){
        this.id = id;
        this.title = title;
    }
    
    public Role(){}
   

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
     * @return Set<Customer> return the customers
     */
    public Set<Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

}