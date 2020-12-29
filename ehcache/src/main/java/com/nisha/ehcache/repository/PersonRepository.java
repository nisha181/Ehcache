package com.nisha.ehcache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisha.ehcache.model.Model;

@Repository
public interface PersonRepository extends JpaRepository<Model, Integer> {

}
