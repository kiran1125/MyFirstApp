package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/hello")
public class HelloController 
{	
	@RequestMapping(value = {"","/","/home"})
	public String hello() {
		return "Hello from Bridgelabz";
	}
	
	@RequestMapping(value="/query",method = RequestMethod.GET)
	public String hello(@RequestParam (value = "name") String name) {
		return "Hello" +" " + name;
	}
	@GetMapping("/get/{name}")
	public String helloOne(@PathVariable String name) {
		return "Hello" +" " + name;
	}
	@PostMapping("/post")
	public String hello(@RequestBody User user) {
		return "Hello " + user.getFirstName() +  user.getLastName();
	}
}
