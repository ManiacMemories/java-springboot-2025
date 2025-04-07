package com.jh99.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public void sayNickName(String nickName) throws Exception {
		if (nickName.equals("애슐리")){
			throw new Exception("이 별명은 안돼요~!!");
		}

		System.out.println("당신의 별명은 " + nickName);
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Spring02Application.class, args);

		// 예외처리
		int result = 0;
		try {
			result = 17 /0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(result);

		String[] names = {"JH","JJ","JY"};
		try{
			System.out.println(names[3]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		} finally {
			System.out.println("예외발생 유무와 상관없이 실행");
			// DB연결종료, 파일 클로즈, 네트워크연결 끊기
		}

		// 예외클래스.
		String name = null;
		try{
			String[] names2 = name.split(" ");
			System.out.println(names2[0]);
		} catch(NullPointerException e){
			System.out.println(e.getMessage());
		}

		Spring02Application app = new Spring02Application();
		try {
			app.sayNickName("애슐리");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료!"); // 정상적으로 프로그램 종료
	}

}
