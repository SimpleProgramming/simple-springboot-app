package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.Animal;

@RestController
@RequestMapping("/autowire")
public class AutowiredController {
	
	private Animal animal;

	//Setter Injection
	@Autowired
	public void setAnimal(@Qualifier("dog") Animal animal) {
		this.animal = animal;
	}

	//Construction Injection
	/*@Autowired
	AutowiredController(@Qualifier("dog") Animal animal) {
		this.animal = animal;
	}*/

	//Setter Injection is non-mandatory injection, server will start and work
	/*@Autowired(required = false)
	public void setAnimal(@Qualifier("dog") Animal animal) {
		this.animal = animal;
	}*/
	
	//Construction Injection is mandatory Injection and this will not work and server will not start
	/*@Autowired(required = false)
		AutowiredController(@Qualifier("dog") Animal animal) {
			this.animal = animal;
		}*/

	//Using Qualifier
	/*@Qualifier("cat")
	@Autowired
	private Animal animal;*/

	@GetMapping
	public String fetchDogCharacteristics() {
		return animal.characteristics();
	}

}
