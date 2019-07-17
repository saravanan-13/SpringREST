package com.pack.springrest.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement
public class Employee {
	private int id;
	
	 @Size(min=3, max=10, message="Your name should be between 3 - 10 characters.")
	 private String name;
	 
	 @Length(min=3, max=10, message="Password should be between 3 - 10 charactes")
	 private String password;
	 
	 @Pattern(regexp=".+@.+\\..+", message="Wrong email!")
	 private String email;	
	

	 @Range(min=18, message="You cannot register if you are under 18 years old.")
	 private int age;
	
	 @Range(min=1, message="Please enter your salary.")
	private double salary;
	
	 @NotEmpty( message="Please enter your role")
	 private String role;
	
	public Employee(String name, String password, String email, int age, double salary, String role) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}
	
}
