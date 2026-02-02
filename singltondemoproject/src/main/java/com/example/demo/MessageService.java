package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public MessageService() {
		System.out.println("messageService constructor called : bean created");
	}
	
	public String getMessage() {
		
		return "Hello From MessagService class :Singleton Bean";
	}
}
