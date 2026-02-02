package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private final SessionBean sb;

	public TestController(SessionBean sb) {
		this.sb = sb;
	}
	
	@GetMapping("/session-test")
	public String getSessionDetails() {
		return "Session ID: " + sb.getSessionId() + " | Bean hashCode: " + sb.hashCode();
	}

}
