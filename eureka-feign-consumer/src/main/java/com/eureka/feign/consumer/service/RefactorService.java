package com.eureka.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.eureka.dto.service.HelloService;

@FeignClient("hello-service")
public interface RefactorService extends HelloService {
	
}
