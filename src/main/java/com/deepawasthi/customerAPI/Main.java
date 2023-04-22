package com.deepawasthi.customerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customer")
public class Main {

	private final CustomerRepository customerRepository;

	public Main(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@GetMapping
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}

	@PostMapping
	public void addCustomer(@RequestBody NewCustomerRequest request){
		Customer customer = new Customer();
		customer.setName(request.name);
		customer.setEmail(request.email);
		customer.setAge(request.age);
		customerRepository.save(customer);
	}

	record NewCustomerRequest(
			String name,
			String email,
			Integer age
	){}

	@DeleteMapping("{id}")
	public void deleteCustomer(@PathVariable("id") Integer id){
		customerRepository.deleteById(id);
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
