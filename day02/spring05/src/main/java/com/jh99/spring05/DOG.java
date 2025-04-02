package com.jh99.spring05;

// Animal 부모클래스를 상속한 Dog 클래스
public class DOG extends Animal {
    
    // 부모 메서드 오버라이딩
    void cry() {
        System.out.println(super.name + "이(가) 웁니다. 멍멍!!");
    }
}
