package com.jh99.spring05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		// 상속
		DOG ppoppy = new DOG();
		ppoppy.setName("뽀삐");
		ppoppy.cry();

		CAT kitty = new CAT();
		kitty.setName("키티");
		kitty.cry();
	}

}
