// package ru.codovstvo.taskmanager.entitydb;

// import java.util.HashSet;
// import java.util.Set;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToMany;

// @Entity
// public class Tag {
//     @Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
//     private Long id;
    
//     private String title;
    
//     // @ManyToMany(mappedBy = "tags")
//     // private Set<Task> tasks = new HashSet<>();


//     public Tag(String title){
//         this.title = title;
//     }

//     public Tag(){}

// }