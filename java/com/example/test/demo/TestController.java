package com.example.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openshift")
public class TestController {
	
	@GetMapping("/test/hello")
	public String sayHello() {
		return "Hello";
	}

}
