package com.makingdevs.nahum.service

import com.makingdevs.nahum.model.Address

interface AddressService{

	Iterable<Address> listAllAddresses()
	
	Address getAddressById(Integer id)
	
	Address saveAddress(Address address)
	
	Address deleteAddress(Integer id)

} 