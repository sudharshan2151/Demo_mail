package com.mail.DemoMail.serive;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mail.DemoMail.Model.Message;

@Service
public class DemoMailService {
	JavaMailSender mail;

	public DemoMailService(JavaMailSender mail) {
		super();
		this.mail = mail;
	}
	
	public void sendMail(Message msg) {
		SimpleMailMessage ms= new SimpleMailMessage();
		ms.setFrom(msg.getFrom());
		ms.setTo(msg.getTo());
		ms.setText(msg.getDescription());
		ms.setSubject(msg.getTitle());
		mail.send(ms);
	}
}

	
