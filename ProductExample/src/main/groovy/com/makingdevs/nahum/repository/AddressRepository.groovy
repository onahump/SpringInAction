package com.makingdevs.nahum.repository

import org.springframework.data.repository.CrudRepository

import com.makingdevs.nahum.model.Address

interface AddressRepository extends CrudRepository<Address, Long>{

}