package com.feign.demo;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHi implements FeignService{

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "sorry" + name;
	}

	
}
