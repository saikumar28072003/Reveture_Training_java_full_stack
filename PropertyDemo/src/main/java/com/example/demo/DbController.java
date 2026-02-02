package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

	private final DatabaseConfig dbconfig;
	
	public DbController(DatabaseConfig dbconfig) {
		
		this.dbconfig=dbconfig;
	}
	
	@GetMapping("/db")
	public String getDbinfo() {
		
		return dbconfig.getDbDetails();
	}
}
