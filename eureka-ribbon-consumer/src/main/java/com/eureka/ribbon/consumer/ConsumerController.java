package com.eureka.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.ribbon.comsumer.service.HelloService;

@RestController
public class ConsumerController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		long start = System.currentTimeMillis();
		String result = helloService.helloService();
		long end = System.currentTimeMillis();
		System.out.println("time : " + (end - start));
		return result;
	}
}
