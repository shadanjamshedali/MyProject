package com.shadan.myfirstproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "users")

public class Users {
	
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String password;
	String name;
	String role;
	
	//generate getters and setters
	

	
	public Long getId() {
		return id;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	//generate setter for password
	

	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	//generate toString method and parameterized constructor
	
	
	public Users() {
		
	}
	
	public Users( String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}	
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	

}
