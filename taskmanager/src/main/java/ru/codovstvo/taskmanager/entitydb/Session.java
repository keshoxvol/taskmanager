package ru.codovstvo.taskmanager.entitydb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//реализовать автоудаление записи через неделю

@Entity
public class Session {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Customer customer;

    private String token;

    private String useragent;


    public Session(){}
    

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
     * @return Customer return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return String return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return String return the useragent
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * @param useragent the useragent to set
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

}