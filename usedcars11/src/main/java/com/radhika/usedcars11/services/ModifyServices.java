package com.radhika.usedcars11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.radhika.usedcars11.entities.Modify;
import com.radhika.usedcars11.repositories.ModifyRepo;

@Service
public class ModifyServices {

	@Autowired
	private ModifyRepo modRepo;
	
	public String addNewMod(Modify e)
	{
		modRepo.save(e);
		return "success";
	}
}
