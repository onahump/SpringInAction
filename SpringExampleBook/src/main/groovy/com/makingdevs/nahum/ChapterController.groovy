package com.makingdevs.nahum 
 
import reactor.core.publisher.Flux 

import org.springframework.web.bind.annotation.GetMapping 
import org.springframework.web.bind.annotation.RestController 
import org.springframework.beans.factory.annotation.Autowired


@RestController 
public class ChapterController { 

	@Autowired
	ChapterRepository repository 

	@GetMapping("/chapters") 
	Flux<Chapter> listing() { 
		repository.findAll() 
	} 
}