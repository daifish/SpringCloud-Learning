package com.eureka.feign.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.dto.model.User;
import com.eureka.feign.consumer.service.HelloService;
import com.eureka.feign.consumer.service.RefactorService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private RefactorService refactorService;
	
	@RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		return helloService.hello();
	}
	
//	@RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
//	public String helloConsumer2() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(helloService.hello()).append("\n");
//		sb.append(helloService.hello("xuanyu")).append("\n");
//		sb.append(helloService.hello("xuanyu", 27)).append("\n");
//		sb.append(helloService.hello(new User("xuanyu", 27))).append("\n");
//		return sb.toString();
//	}
	
	@RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
	public String helloConsumer3() {
		StringBuilder sb = new StringBuilder();
		sb.append(refactorService.hello("xuanyu")).append("\n");
		sb.append(refactorService.hello("xuanyu", 27)).append("\n");
		sb.append(refactorService.hello(new User("xuanyu", 27))).append("\n");
		return sb.toString();
	}
	
}
