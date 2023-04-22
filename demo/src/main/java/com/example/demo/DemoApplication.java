package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("This is My First Spring Project	" + "Hello %s", name);
	}
	
	@GetMapping("/hello")
	public String helloWorld(@RequestParam(value = "name", defaultValue = "Manjeet") String name) {
		return String.format("This gets printed when you type http://localhost:8080/hello in the browser");
	}

}
