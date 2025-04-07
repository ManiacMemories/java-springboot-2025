package com.jh99.spring05;

// Animal 부모클래스를 상속한 Cat 클래스
public class CAT extends Animal {

    
    void cry() {
        System.out.println(super.name + "이(가) 웁니다. 야옹!!");
    }
}
