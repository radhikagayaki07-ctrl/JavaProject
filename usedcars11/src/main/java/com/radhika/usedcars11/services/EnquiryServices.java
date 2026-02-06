package com.radhika.usedcars11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radhika.usedcars11.entities.Enquiry;
import com.radhika.usedcars11.repositories.EnquiryRepo;

@Service
public class EnquiryServices {

	@Autowired
	private EnquiryRepo enqRepo;
	
	public String addNewEnquiry(Enquiry e)
	{
		enqRepo.save(e);
		return "success";
	}

}
