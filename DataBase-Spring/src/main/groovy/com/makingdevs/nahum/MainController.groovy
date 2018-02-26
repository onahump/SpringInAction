package com.makingdevs.com

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import com.makingdevs.com.User
import com.makingdevs.com.UserRepository

@Controller
@RequestMapping(path="demo")
public class MainController{

	@Autowired
	private UserRepository userRepository

	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email){

		User n = new User(name:name,
						  email:email)
		n.userRepository.save(n)
		return "Saved"
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		userRepository.findAll()
	}
}