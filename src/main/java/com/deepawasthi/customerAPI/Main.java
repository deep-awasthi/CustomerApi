package com.deepawasthi.customerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

//	@GetMapping("/hello")
//	public String hello(){
//		return "hello";
//	}
//
//	// JSON Viewer
//	@GetMapping("/greet")
//	public GreetResponse greet(){
//		return new GreetResponse(
//				"Hello",
//				List.of("Java", "Spring", "Springboot"),
//				new Person("Deep", 23, "Deloitte")
//				);
//	}
//	record GreetResponse(
//			String greet,
//			List<String> favTech,
//			Person person
//	){}
//
//	record Person(String name, int age, String company){}
}
