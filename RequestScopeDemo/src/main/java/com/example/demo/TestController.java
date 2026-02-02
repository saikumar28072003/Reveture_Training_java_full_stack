package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private final RequestBean rqb;

	public TestController(RequestBean rqb) {
		this.rqb = rqb;
	}
	
	@GetMapping("/test")
	public String testRequestScope()
	{
		return "Request ID: " + rqb.getRequestId()+ " | Bean hashCode: " + rqb.hashCode();

	}
	
}
