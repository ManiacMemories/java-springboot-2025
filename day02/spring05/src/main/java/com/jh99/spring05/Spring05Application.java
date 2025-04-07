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
		// ppoppy.age = 8;
		ppoppy.setAge(450);
		System.out.println("뽀삐의 나이는 " + ppoppy.getAge() + "살");

		CAT kitty = new CAT();
		kitty.setName("키티");
		kitty.cry();
		// kitty.age = 3;
		kitty.setAge(450);
		System.out.println("키티의 나이는 " + kitty.getAge() + "살");

		DOG choonsam = new DOG();
		choonsam.setName("춘삼");
		choonsam.cry();


	}

}
