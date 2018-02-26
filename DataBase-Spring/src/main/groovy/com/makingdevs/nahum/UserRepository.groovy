package com.makingdevs.nahum

import org.springframework.data.repository.CrudRepository

import com.makingdevs.nahum.User

public interface UserRepository extends CrudRepository<User, Long>{
	
}