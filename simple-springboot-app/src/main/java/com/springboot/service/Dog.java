package com.springboot.service;

import org.springframework.stereotype.Service;

public class Dog implements Animal {

	@Override
	public String characteristics() {
		// TODO Auto-generated method stub
		return "Bark";
	}
}
