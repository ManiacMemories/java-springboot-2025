package com.jh99.spring02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		// 배열
		int[] score = {90, 98, 100, 76, 83};
		System.out.println(score.length);

		score[4] = 85;

		System.out.println(score);

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		// 두번째 배열
		String[] carcompany = {"Hyundai", "Kia", "BMW", "Mercedes", "Tesla"};
		
		for(String car : carcompany) {
			System.out.println(car);
		}

		// Java 컬렉션으로 변경
		List <String> car_List = Arrays.asList(carcompany);
		System.out.println(car_List);
		System.out.println(car_List.get(1));
		
		Arrays.sort(score);
		for (int item : score) {
			System.out.println(item);
		}

		Arrays.sort(carcompany, Collections.reverseOrder());
		for(String car : carcompany); {
			System.out.println(car);
		}
	}

}
