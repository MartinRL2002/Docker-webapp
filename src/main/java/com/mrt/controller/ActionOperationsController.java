package com.mrt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ActionOperationsController {
	
	@GetMapping("/wish/{name}")
	public ResponseEntity<String> showWishMEssage(@PathVariable String name){
		return new ResponseEntity<String>("GOOD MORNING:: "+name,HttpStatus.OK);
	}

}
