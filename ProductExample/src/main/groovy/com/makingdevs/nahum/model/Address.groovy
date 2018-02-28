package com.makingdevs.nahum.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
public class Address{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id

	@NotNull
	private String street

	@NotNull
	private Integer outdoorNumber

	@NotNull
	private Integer interiorNumber

	@NotNull
	private Integer postCode

	@NotNull
	private String neighborhood

	@NotNull
	private String state

	@NotNull
	private String city

	@NotNull
	private String country
}