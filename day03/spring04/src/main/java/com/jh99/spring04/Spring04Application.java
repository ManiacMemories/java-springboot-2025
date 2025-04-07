package com.jh99.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 문자열, 시간타입 핸들링
		String string1 = "Hello";
		System.out.println(string1);
		String string2 = new String("Hello");
		System.out.println(string2);

		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));

		String string3 = string2;
		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));

		// 문자열 메서드 연습
		String carstr = "avante, ionic, x3";
		String[] cars = carstr.split(",");
		for (String car : cars) {
			System.out.println(car.trim());
		}

		for (String car : cars) {
			System.out.println(car.toUpperCase());
		}

		String caresult1 = carstr.replace(", ","/");
		System.out.println(caresult1);

		String caresult2 = carstr.replace(", ","/");
		System.out.println(caresult2);

		char[] charLst = string1.toCharArray();
		for (char oneChar : charLst) {
			System.out.println(oneChar);
		}


	}

}
