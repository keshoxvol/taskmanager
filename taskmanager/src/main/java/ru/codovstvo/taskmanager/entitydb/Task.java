package ru.codovstvo.taskmanager.entitydb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String title;

    @ManyToOne
    private Customer executor;

    @ManyToOne
    private Project project;
    
    @ManyToOne
    private Status status;
    
    @ManyToOne
    private ImportanceStatus importanceStatus;

    // @ManyToMany
    // private Set<Tag> tags = new HashSet<>();

    
    public Task(String title, Project project, Status status, ImportanceStatus importanceStatus){
        this.title = title;
        this.project = project;
        this.status = status;
        this.importanceStatus = importanceStatus;
    }

    public Task(){}


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
     * @return Customer return the executor
     */
    public Customer getExecutor() {
        return executor;
    }

    /**
     * @param executor the executor to set
     */
    public void setExecutor(Customer executor) {
        this.executor = executor;
    }

    /**
     * @return Project return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
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