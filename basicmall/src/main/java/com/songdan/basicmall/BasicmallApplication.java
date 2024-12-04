package com.songdan.basicmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BasicmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicmallApplication.class, args);

	}

	@GetMapping(value = "/")
	public String HelloWorld(){
		return "Hello World";
	}

}

