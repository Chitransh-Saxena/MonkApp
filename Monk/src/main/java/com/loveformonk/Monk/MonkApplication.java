package com.loveformonk.Monk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController										// This annotation makes current class serve as Rest End Points
public class MonkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonkApplication.class, args);	}


}
