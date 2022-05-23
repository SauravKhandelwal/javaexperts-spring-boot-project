/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Customer;

/**
 * @author Saurav_Khandelwal
 *
 */
@RestController
@RequestMapping("/register")
public class RegistrationController {

	@GetMapping("/hello")  
	public String hello()   
	{  
	return "Hello Every One morning batch";  
	}
	
	
	@PostMapping("/getdata")
	public String registration(@RequestBody Customer customer) {
		System.out.println("Customer data received:"+customer);
		return "Registration Sucess";
	}
	
	
}
