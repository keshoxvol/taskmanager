// package ru.codovstvo.taskmanager.entitydb;

// import java.util.HashSet;
// import java.util.Set;

// import javax.persistence.CascadeType;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;

// @Entity
// public class Task {
//     @Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
// 	private Integer id;
	
// 	private String title;
//     private String description;
//     @ManyToMany(cascade = { CascadeType.ALL })
//     @JoinTable(
//         name = "Task_Tag", 
//         joinColumns = { @JoinColumn(name = "employee_id") }, 
//         inverseJoinColumns = { @JoinColumn(name = "project_id") }
//     )
//     private Set<Tag> tags = new HashSet<>();
    
//     public Task(String title, String description, HashSet<Tag> tags){
//         this.title = title;
//         this.description = description;
//         this.tags = tags;
//     }

//     public Task(){}

// }