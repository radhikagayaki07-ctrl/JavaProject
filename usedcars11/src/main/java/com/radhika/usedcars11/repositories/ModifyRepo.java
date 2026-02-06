package com.radhika.usedcars11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radhika.usedcars11.entities.Modify;

@Repository
public interface ModifyRepo extends JpaRepository<Modify, Integer>{

}
