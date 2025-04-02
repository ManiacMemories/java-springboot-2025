package com.jh99.spring03;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Spring03Application {

	// 정적 메서드에서는 같은 클래스내 일반 메서드를 호출할 수 없다.
	// 정적 메서드는 같은 클래스내 정적 메서드만 호출할 수 있다.
	// 다른 클래스는 상관이 없음.
	// 정적 메서드는 클래스 인스턴스 생성없이(new) 바로 호출할 수 있다.
	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// 메서드
		sayHi();

		// Car클래스 인스턴스 생성
		Car mycar = new Car();
		mycar.name = "아이오닉";
		mycar.year = 2018;

		mycar.printCarName();

		System.out.println("75는 짝수? " + isEven(75));
	}

	public void printHello() {
		System.out.println("Hello, Spring");
	}

	public static void sayHi() {
		System.out.println("Hi, Spring");
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

public class Car{
	public String name;
	public int year;
	String company;

	public void printCarName() {
		System.out.println("차 이름 : " + name);
	}

	// 매서드 오버로딩
	public void printCarName(String point) {
		System.out.println("차 이름 : " + name);
	}

	// 가변인자
	public void printCarName(String... name) {
		for (String n : name) {
			System.out.println(n);
		}
	}

	int calcYear(int currYear) {
		return currYear - year;
	}
}
