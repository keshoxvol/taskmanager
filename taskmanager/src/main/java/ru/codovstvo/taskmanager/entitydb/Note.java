// package ru.codovstvo.taskmanager.entitydb;

// import java.util.HashSet;
// import java.util.Set;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
// public class Note {
//     @Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
//     private Integer id;
// 	private String title;
//     private String description;
//     private Set<Tag> tags = new HashSet<>();

//     public Note(String title, String description, HashSet<Tag> tags){
//         this.title = title;
//         this.description = description;
//         this.tags = tags;
//     }

//     public Note(){}

// }