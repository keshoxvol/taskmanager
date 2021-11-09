package ru.codovstvo.taskmanager.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.codovstvo.taskmanager.entitydb.Tag;
import ru.codovstvo.taskmanager.repo.TagRepo;

@RestController
@RequestMapping(path = "tag")
public class TagController {
    @Autowired
	private TagRepo tagRepo;

    @PostMapping("/add")
    public void addTag(@RequestParam(value = "title") String title){
        tagRepo.save(new Tag(title));
    }

    @PostMapping("/deletebyid")
	public void deletebyid(@RequestParam(value = "id") Long id){
		tagRepo.deleteById(id);
	}

    @GetMapping("/all")
    public Iterable<Tag> getAllStatus(){
        Iterable<Tag> tags = tagRepo.findAll();
        return tags;
    }
}