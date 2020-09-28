package com.alex

fun main() {
    println("Hello kotlin..")


    val b = Human(66.5f, 1.7f)




    println(b.hello())


//    變數
/*
    val 不可變的
    var 可變的
 */

    var age = 19;
//  自動推斷
    var age2: Int = 20;
    var weight : Float = 66.5f;
    var name : String;
    name = "Alex"
    println(name)

    val h = Human(66.5f, 1.7f)
    print(h.bmi())





}

class Human(var weight: Float, var height: Float) {
    fun bmi():Float {
        val bmi = weight / (height * height)
        return bmi
    }


    fun hello() {
        println("Hello human")
    }
}