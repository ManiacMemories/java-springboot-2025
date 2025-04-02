package com.jh99.spring03;


public class car {
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

    public static void printYear
}
