// package ru.codovstvo.taskmanager.entitydb;

// import java.util.HashSet;
// import java.util.Set;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
// public class Tag {
//     @Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
//     private Integer id;
//     private String title;
//     // private Set<Note> notes = new HashSet<>();
//     private Set<Task> tasks = new HashSet<>();

//     public Tag(String title){
//         this.title = title;
//     }

//     public Tag(){}

// }