package ru.codovstvo.taskmanager.entitydb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//реализовать автоудаление записи через неделю

import lombok.Data;

@Data
@Entity
public class Session {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private UserEntity user;

    private String token;

    private String useragent;


    public Session(){}
    
}