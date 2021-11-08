package ru.codovstvo.taskmanager.entitydb;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Task {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
    
    @ManyToOne
    @JoinColumn(name = "tasksInStatusTable")
    private Status status;
    
    @ManyToOne
    @JoinColumn(name = "tasksInImportanceStatusTable")
    private ImportanceStatus importanceStatus;

    @ManyToMany
    @JoinTable(
        name = "task_tags", 
        joinColumns = @JoinColumn(name = "task_id"), 
        inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags = new HashSet<>();

    public Task(String title, Status status, ImportanceStatus importanceStatus){
        this.title = title;
        this.status = status;
        this.importanceStatus = importanceStatus;
    }

    public Task(){}


    /**
     * @return Integer return the id
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
     * @return Status return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }


    /**
     * @return Set<Tag> return the tags
     */
    public Set<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }


    /**
     * @return ImportanceStatus return the importanceStatus
     */
    public ImportanceStatus getImportanceStatus() {
        return importanceStatus;
    }

    /**
     * @param importanceStatus the importanceStatus to set
     */
    public void setImportanceStatus(ImportanceStatus importanceStatus) {
        this.importanceStatus = importanceStatus;
    }

}