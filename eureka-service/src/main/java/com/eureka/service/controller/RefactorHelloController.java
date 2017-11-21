package com.eureka.service.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.dto.model.User;
import com.eureka.dto.service.HelloService;

@RestController
public class RefactorHelloController implements HelloService {

	@Override
	public String hello(@RequestParam("name") String name) {
		// TODO Auto-generated method stub
		return "hello" + name;
	}

	@Override
	public User hello(@RequestHeader String name, @RequestHeader Integer age) {
		// TODO Auto-generated method stub
		return new User(name, age);
	}

	@Override
	public String hello(@RequestBody User user) {
		// TODO Auto-generated method stub
		return "hello" + user.getName() + ", " + user.getAge();
	}
	
	
}
