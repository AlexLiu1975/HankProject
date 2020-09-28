package com.alex

fun main() {
    println("Hello kotlin..")
    Human().hello()

    val h = Human()
    h.hello()

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





}

class Human(){
    fun hello() {
        println("Hello human")
    }
}