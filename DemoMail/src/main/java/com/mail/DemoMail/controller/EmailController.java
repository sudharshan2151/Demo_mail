package com.mail.DemoMail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.DemoMail.Model.Message;
import com.mail.DemoMail.serive.DemoMailService;

@RestController
public class EmailController {
	
	DemoMailService service;

	public EmailController(DemoMailService service) {
		super();
		this.service = service;
	}
	
	 @GetMapping("/sendMail")
	 public String sendMail() {
		 Message message = new Message("sudharsunking@gmail.com","How are you","I am fine");
		 service.sendMail(message);
		 System.out.println(message);
		 return "Send Sucessfully";
	 }
	

}
