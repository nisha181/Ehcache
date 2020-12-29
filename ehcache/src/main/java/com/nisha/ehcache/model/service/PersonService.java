package com.nisha.ehcache.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.nisha.ehcache.model.Model;
import com.nisha.ehcache.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repo;
	
	static HashMap<String, Model> mdl = new HashMap<>();
	
	public static final String HASH_KEY = "Profile";
	
	@Cacheable( value = "personCache", 
      key = "#model")
	public Model addPerson(Model model) {
		mdl.put(HASH_KEY,model);
	    repo.save(model);
	    return model;
		
	}
	
	@Cacheable(value="personCache",key= "'ALL'")
	public List<Model> display(){
		List<Model> list=(List<Model>) mdl.values();
		return list;
	}
	

}
