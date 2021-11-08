package ru.codovstvo.taskmanager.entitydb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Status {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String title;
    
    @OneToMany(targetEntity = Task.class)
    private List<Task> tasksInStatusTable = new ArrayList<>();

    public Status(String title){
        this.title = title;
    }

    public Status(){}

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
     * @param tasksInStatusTable the tasksInStatusTable to set
     */
    public void setTasksInStatusTable(List<Task> tasksInStatusTable) {
        this.tasksInStatusTable = tasksInStatusTable;
    }

}

