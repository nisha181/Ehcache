package com.nisha.ehcache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisha.ehcache.model.Model;
import com.nisha.ehcache.model.service.PersonService;

@RestController
@RequestMapping("/model")
public class PersonController {
	
	@Autowired
	PersonService ser;
	
	@PostMapping("/add")
	public Model addPerson(@RequestBody Model model) {
		return ser.addPerson(model);
	}
	@GetMapping("/display")
	public List<Model> display(){
		return ser.display();
	}

}
