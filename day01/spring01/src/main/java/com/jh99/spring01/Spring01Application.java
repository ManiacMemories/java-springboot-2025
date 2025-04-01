package com.jh99.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		System.out.println("Hello Spring Boot!");

		// 변수 연습
		int account = 100000000;
		System.out.println("계좌금액은 = " + account);
		float pi = 3.14f;
		System.out.println("원주율은 = " + pi);
		char ch_first = 'A';
		System.out.println("첫번째 문자 = " + ch_first);

		// 연산자 연습
		int a = 17;
		int b = 24;
		System.out.printf("a + b = %d\n" , (a + b));
		System.out.printf("a - b = %d\n" , (a - b));
		int divresult = b % a;
		System.out.printf("b %% a = %d\n" , divresult);

		System.out.println("a++ = "+ a++); // 연산자 우선순위
		System.out.println("a++ = "+ ++a);

		// 비트연산 and, or, xor
		System.out.println("40 & 124 =  " + (40 & 124));
		// 40 = 0010 1000
		// 124 = 0111 1100
		// 0000 0011 << 2 0000 1000

		boolean case1 = 40 > 20; // true
		boolean case2 = 40 < 20; // false
		boolean case3 = 40 == 20; // false
		boolean case4 = 40 != 20; // true
		System.out.println("case1 = " + case1);
		System.out.println("case2 = " + case2);
		System.out.println("case3 = " + case3);
		System.out.println("case4 = " + case4);
		System.out.println("case1 && case2 = " + (case1 && case2)); // false
		System.out.println("case1 || case2 = " + (case1 || case2)); // true
		System.out.println("case1 ^ case2 = " + (case1 ^ case2)); // true
		System.out.println("!case1 = " + !case1); // false
		System.out.println("!case2 = " + !case2); // true
		System.out.println("case1 & case2 = " + (case1 & case2)); // false
		System.out.println("case1 | case2 = " + (case1 | case2)); // true
	}
}
