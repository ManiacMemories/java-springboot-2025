package com.jh99.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner; // 콘솔 입력받을 클래스 선언

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		Scanner scan = new Scanner(System.in); // 콘솔 입력받기 위한 객체 생성

		System.out.print(">> 아이디 입력 : ");
		String userid = scan.next(); // 콘솔에서 입력받은 값을 userid에 저장
		System.out.print(">> 비밀번호 입력 : ");
		String userpw = scan.next(); // 콘솔에서 입력받은 값을 userpw에 저장
		
		System.out.println("입력한 아이디 : " + userid); // 입력받은 아이디 출력
		System.out.println("입력한 비밀번호 : " + userpw); // 입력받은 비밀번호 출력

		if (userid.equals("jh99") && userpw.equals("12345")) { // 입력받은 아이디와 비밀번호가 일치하는지 확인
			System.out.println("로그인 성공"); // 로그인 성공 메시지 출력
		} else {
			System.out.println("로그인 실패, 아이디나 패스워드 오류"); // 로그인 실패 메시지 출력
		}

		// switch문을 사용하여 비밀번호에 따라 다른 메시지 출력
		switch (userpw) {
			case "12345":
				System.out.println("패스워드 변경 해주세요.");
				break;
			case "1234":
				System.out.println("패스워드가 다릅니다.");
			case "123":
				System.out.println("패스워드가 오류!!");
				break;
			default:
				System.out.println("전체 오류!");
				break;
		}

		// 3항 연산자
		String result = (userpw.equals("12345")) ? "메인화면진입" : "로그인화면으로";
		System.out.println("다음화면 >> " + result); // 3항 연산자 결과 출력
	}
	

}
