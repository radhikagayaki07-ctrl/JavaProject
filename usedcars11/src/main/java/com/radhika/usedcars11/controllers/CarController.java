package com.radhika.usedcars11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.radhika.usedcars11.entities.UsedCar;
import com.radhika.usedcars11.services.UsedCarsServices;

@Controller
public class CarController {

	@Autowired
	private UsedCarsServices carServices;
	
	
	//homepage
	@GetMapping("/")
	public String homePage()
	{
		return "index.jsp";
	}
	//login
	@PostMapping("/login")
	public String login(String username, String password)
	{
		String page="";
		
		if(username.equals("radhika") && password.equals("liverpool"))
			page="AdminPanel.jsp";
		else
			page="LoginFailed.jsp";
		
		return page;
	}
	//add car
	@GetMapping("/newcar")
	public String newCar()
	{
		return "AddNewCar.html";
	}
	//save car
	@PostMapping("/savecar")
	public String saveCar(UsedCar car)
	{
		carServices.addNewCar(car);
		return "NewCarAdded.jsp";
	}

	
	
	
}
//User -> html form -> Controller -> Services -> 
