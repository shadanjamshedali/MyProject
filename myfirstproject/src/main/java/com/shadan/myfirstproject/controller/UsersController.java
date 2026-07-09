
package com.shadan.myfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shadan.myfirstproject.model.Users;
import com.shadan.myfirstproject.service.UsersServiceImpl;


@RestController
@RequestMapping("/api")
public class UsersController {
	
	
	@Autowired
	private UsersServiceImpl service;
	
	
	@GetMapping("/get")
	public String myController() {
		
		return "my first project";
	}
	
	//create apis for service
	
	@GetMapping("allusers")
	public ResponseEntity<Page<Users>>  getAll( @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
		
		Page<Users> pUsers=service.getUsers(page,size,sortBy);
		
		return ResponseEntity.ok(pUsers);
		
		
		
		
	}
	
	
	public ResponseEntity<Users> getUserById(long id){
        
        return ResponseEntity.ok(service.getUserById(id));
	
	}
	
	@PostMapping("/add")
	public ResponseEntity<Users> addUser(@RequestBody Users user){
		
		
        
		Users saveduser=service.addUser(user);
		
		return new ResponseEntity<>(saveduser,HttpStatus.CREATED);
        
	}
		
	}

