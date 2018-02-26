package com.makingdevs.nahum

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import com.makingdevs.nahum.User
import com.makingdevs.nahum.UserRepository

@Controller
@RequestMapping(path="demo")
public class MainController{

	@Autowired
	private UserRepository userRepository

	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email){

		User n = new User(name:name,
						  email:email)
		userRepository.save(n)
		return "Saved"
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll()
	}
}