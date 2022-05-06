package com.gourav.mvp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MvpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvpApplication.class, args);
	}

}
