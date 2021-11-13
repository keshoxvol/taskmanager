package ru.codovstvo.taskmanager.entitydb;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ImportanceStatus {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    
    @OneToMany(targetEntity = Task.class)
    private Set<Task> tasks = new HashSet<>();


    public ImportanceStatus(String title){
        this.title = title;
    }

    public ImportanceStatus(){}


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