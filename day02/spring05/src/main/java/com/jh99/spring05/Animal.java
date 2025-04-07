package com.jh99.spring05;

// 부모클래스 동물
public class Animal {
    // String name; defalut
    // public String name // public
    private String name; // private
    // protected String name; // protected
    private int age; // 동물의 나이

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 음수가 너무큰수가 들어가지 않도록 막아줌
        if(age <= 0) {
            this.age = 1; // 음수
        } else if (age > 20){
            this.age = 20; // 너무 큰수 막기
        } else {
            this.age = age;
        }
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이 웁니다.");
    }
}
