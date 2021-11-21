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
public class Company {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String companyName;

    @OneToMany(targetEntity = Department.class)
    private Set<Department> departments;

    @ManyToOne
    private UserEntity owner;

    @ManyToMany(mappedBy = "companiesMembership")
    private Set<UserEntity> memberships;


    public Company(String companyName){
        this.companyName = companyName;
    }

    public Company(){}
    
}
