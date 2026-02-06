package com.radhika.usedcars11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.radhika.usedcars11.entities.UsedCar;
import com.radhika.usedcars11.repositories.UsedCarsRepo;

@Service
public class UsedCarsServices {
	
	@Autowired
	private UsedCarsRepo carsRepo;
	
	public String addNewCar(UsedCar car)
	{
		carsRepo.save(car);
		return "success";
	}
}
