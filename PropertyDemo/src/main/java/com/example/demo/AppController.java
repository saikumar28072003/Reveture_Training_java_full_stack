package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	private final AppInfoService appinfoservice;
	
	public AppController(AppInfoService appinfoservice) {
		this.appinfoservice=appinfoservice;
	}
	
	@GetMapping("/info")
	public String getInfo() {
		return appinfoservice.getAppInfo();
	}
	
}
