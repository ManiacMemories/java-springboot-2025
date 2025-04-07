package com.jh99.spring01;

public interface Animal {
    // public String name = "이름";
    // public int age = 1;


    void cry(); // 내부 구현이 없음

    public default void introduce() {
        System.out.println("저는 동물이에요.");
    }
}
