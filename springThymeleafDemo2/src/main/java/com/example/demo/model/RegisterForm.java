package com.example.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterForm {

	@NotBlank(message="name is required")
	private String name;
	
	@Email(message="email format is wrong")
	@NotBlank(message="email is required")
	private String email;
	
	@Size(min =4, message="Password must be atleast 4 characters")
	private String Password;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
