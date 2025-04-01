package com.jh99.spring03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// for문 연습
		String names[] = {"홍길동", "이순신", "강감찬", "유관순", "안중근"};

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);

		for (int i = 0; i < names.length; i++) {
			System.out.println("이름: " + names[i]);
		}
		for (String name : names) {
			System.out.println("이름: " + name);
		}
	}

}
