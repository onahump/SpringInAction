package com.makingdevs.com

import com.makingdevs.com.User
import com.makingdevs.com.UserRepository

@Controller
@RequestMapping(path="demo")
public class UserController{

	@Autowired
	private UserRepository userRepository

	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email){

		User n = new User()
		userRepository.save(n)
		return "Saved"
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers(){
		userRepository.findAll()
	}
}