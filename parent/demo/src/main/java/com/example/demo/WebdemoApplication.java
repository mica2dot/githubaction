package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebdemoApplication {

	public static void main(String[] args) {
		Public p = Public.builder().abc("abcdef").abc2(2222).build();
		System.out.println(p);

		SpringApplication.run(WebdemoApplication.class, args);
	}

	public void abc(){
		new Public("");
		Public p = Public.builder().abc("aaa").build();
	}
}
