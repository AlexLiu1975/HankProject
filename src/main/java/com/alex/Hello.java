package com.alex;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("hello world..");



//        new Person().hello();

        Person p = new Person();
        p.hello();

        System.out.println(p.bmi());


        p.height = 1.7f;
        p.weight = 66.5f;
        p.bmi();


    }
}
