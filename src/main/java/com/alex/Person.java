package com.alex;

public class Person {
//    final double pi = 3.14;

    String name;
    float height;
    float weight;

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi ;


    }

    public void hello() {
        System.out.println("Hello Person..");

/*
//      變數
        int age = 10;
        char c = '我';
        byte  b = 120;
        float weight = 66.5f;
        boolean adult = true;
        boolean enroll = false;
        String name = "alex";


//      類別
        Integer age2 = 19;
        System.out.println(age2.equals("Alex"));

*/


    }
}
