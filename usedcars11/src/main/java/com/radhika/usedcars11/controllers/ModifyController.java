package com.radhika.usedcars11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.radhika.usedcars11.entities.Modify;
import com.radhika.usedcars11.services.ModifyServices;

@Controller
public class ModifyController {
	
	@Autowired
	private ModifyServices modServices;

	@GetMapping("/modify")
	public String modify()
	{
		return "ModifyCarInfo.html";
	}
	
	@PostMapping("/savemod")
	public String saveEnq(Modify mod,Model m)
	{
		modServices.addNewMod(mod);
		m.addAttribute("modify", mod);
		return "CarInfoModified.jsp";
	}
}
