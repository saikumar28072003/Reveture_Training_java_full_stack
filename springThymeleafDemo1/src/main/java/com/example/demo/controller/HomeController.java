package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/sample")
	public String sample(Model model) {
		
		model.addAttribute("name", "sai");
		model.addAttribute("city", "nellore");
		
		return "sample";
	}
}
