package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping()
	public String getUser() {
		return " get mapping with user :";
	}
	
	@GetMapping(value="/user/{userid}")
	public String getUsers1(@PathVariable String userid) {
		return "User with user id:"+userid;
	}
	
	@GetMapping("/users")
	public String getUSers2(@RequestParam(value="page")int pageno, @RequestParam (value="id") int userid) {
		
		return "page no:"+pageno +"id :"+userid;
	}

}
