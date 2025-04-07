package com.jh99.spring04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Stream;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 람다식
		// 1. 일반방식
		Spring04Application app = new Spring04Application();
		System.out.println(app.helloJava());

		// 2. 람다방식
		myFuncInterface fi = () -> {System.out.println("Hello, Java");};
		fi.printHello();

		// myCalc calc = (x, y) -> { return x + y;};
		// int result = calc.plus(100,55);
		// System.out.println(result);

		List<String> avengers = Arrays.asList("IronMan", "Captain America", "SpiderMan","Hulk","AntMan");

		Collections.sort(avengers);
		System.out.println(avengers);

		for (String hero : avengers) {
			System.out.println(hero);
		}
		// 단점은 출력시 반복문써야하고, 정렬후 원본 순서가 사라짐

		// 2. 스트림 API 사용방식
		// avengers = Arrays.asList("IronMan", "Captain America", "SpiderMan","Hulk","AntMan");

		// Stream<String> avengersStream = avengers.stream();
		// avengersStream.sorted().forEach(System.out::println);
		// System.out.println(avengers);

		// 스트림 API 실습
		List<String> originList = Arrays.asList("a1","c2","b3","c1", "a2","b1");

		// c로 시작하는 요소만 뽑아서, 대문자로 변경하고, 정렬해서 갯수를 출력하시오.
		List<String> copyList = new ArrayList<>(originList);
		System.out.println(originList);
		System.out.println(copyList);
		// c로 시작하는 요소만 뽑아서, 대문자로 변경하고, 정렬해서, 갯수를 출력하시오.

		// 기존방식으로 처리
		// 1. 각 요소에서 c로 시작하는 것만 추출
		List<String> lastList = new ArrayList<>();
		for (String elmt : copyList) {
			if (elmt.startsWith("c")) {
				lastList.add(elmt);
			}
		}
		// 2. 대문자변경
		for (int i=0; i < lastList.size(); i++) {
			lastList.set(i, lastList.get(i).toUpperCase());
		}
		System.out.println(lastList);

		// 3. 정렬
		Collections.sort(lastList);
		System.out.println(lastList.size());

		// 스트림API를 쓰면 - 1줄로 끝!
		System.out.println(originList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().toList());
	}

	

	public String helloJava() {
		return "Hello Java!";
	}

	@FunctionalInterface//
	public interface myFuncInterface {
		void printHello();
	}

	public interface myCalc {
		int plus(int x, int y);
		int minus(int x, int y);
	}
}
