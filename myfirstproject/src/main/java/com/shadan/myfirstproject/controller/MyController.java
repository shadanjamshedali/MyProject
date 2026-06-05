
package com.shadan.myfirstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	
	@GetMapping("/get")
	public String myController() {
		
		return "my first project";
	}

}
