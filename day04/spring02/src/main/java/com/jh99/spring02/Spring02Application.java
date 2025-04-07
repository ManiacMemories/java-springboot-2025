package com.jh99.spring02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		int num = 10;
		float fnum = 3.14f;
		double dnum = 345.67;
		long lnum = 3451361667L;

		Integer num2 = 10;
		Float fnum2 = 3.14f;
		Double dnum2 = 1316315.1341516;
		Long lnum2 = 231513415l;

		SpringApplication.run(Spring02Application.class, args);

		storage<String> storage1 = new storage<String>();
		storage1.setItem("ionic");
		System.out.println(storage1.getItem());

		// 제네릭 정수사용
		storage<Float> storage2 = new storage<Float>();
		storage2.setItem(3.141592F);
		System.out.println(storage2.getItem());

		Spring02Application app = new Spring02Application();
		System.out.println(app.convert(storage1));
	}
	public <T> List<Character> convert(storage<T> storage) {
		ArrayList<Character> list = new ArrayList<>();

		String s = String.valueOf(storage.getItem());
		for (int i = 0; i < s.length(); i++){
			list.add(s.charAt(i));
		}
		return list;
	}

	public void print(Storage<? extends Storage> st) {
		
	}
}
