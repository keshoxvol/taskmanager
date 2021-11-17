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

import lombok.Data;

@Data
@Entity
public class Role {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();


    public Role(Long id,String roleName){
        this.id = id;
        this.roleName = roleName;
    }
    
    public Role(){}

}