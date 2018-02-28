package com.makingdevs.nahum.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import com.makingdevs.nahum.service.AddressService
import com.makingdevs.nahum.model.Address

@Controller
public class AddressController{

    @Autowired
    private AddressService addressService

    @RequestMapping(value = "/addresses", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("addresses", addressService.listAllAddresses())
        "Addresses"
    }

    @RequestMapping(value = "address/{id}")
    public String showAddress(@PathVariable Integer id,Model model){
        model.addAttribute("address",addressService.getAddressById())
        "addressShow"
    }



}