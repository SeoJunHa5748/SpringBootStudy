package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor

public class HelloLonbok {
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLonbok helloLombok = new HelloLonbok("헬로",5);
	
	System.out.println(helloLombok.getHello());
	System.out.println(helloLombok.getLombok());
	}
	

}
