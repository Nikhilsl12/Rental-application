package com.rentalappapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentalappapi.api.service.SendEmailService;

@RestController
public class EmailController {
	
	@Autowired
	private SendEmailService sendEmailService;
	
	@GetMapping("/sendEmail")
	public String sendEmail() {
		sendEmailService.sendEmail("rentsmart.infy@gmail.com", "Test body message....", "Test subject");
		return "Sent successfully";
	}

}
