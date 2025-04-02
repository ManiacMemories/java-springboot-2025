package com.jh99.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);

		// while문 - 조건이 true일 때 반복
		int num = 10;

		while (num >= 0) {
			System.out.println(num);
			num--;
		}

		System.out.println("while문 종료");
		// do-while문 - 조건이 false일 때도 한번은 실행
		int cnt = 1;
		do {
			System.out.println(cnt);
			cnt++;
		} while (cnt < 10);

		System.out.println("do-while문 종료");

		num = 1;
		// break, continue문
		while (num < 11) {
			if (num % 2 == 0) {
				num++; 	
				continue;
			}
			System.out.println(num);
			num++;

			
		}
	}

}
