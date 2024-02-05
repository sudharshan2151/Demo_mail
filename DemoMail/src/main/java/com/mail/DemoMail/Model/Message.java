package com.mail.DemoMail.Model;

import org.springframework.beans.factory.annotation.Value;

public class Message {
	String to;
	String title;
	String description;
	@Value("${mail}")
	String from;
	public Message(String to, String title, String description) {
		super();
		this.to = to;
		this.title = title;
		this.description = description;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
	
	

}
