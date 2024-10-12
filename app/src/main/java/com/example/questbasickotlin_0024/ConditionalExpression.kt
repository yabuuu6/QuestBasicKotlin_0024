package com.example.questbasickotlin_0024

//conditional expression
//adalah ekspresi yang mengembalikann nilai berdasarkan kondisi tertentu
//conditional espression menggunakan if else ,when, dan trycatch
fun ConditionalStatement(){
    println("=== Conditonal Expression ===")

    //if-else
    val number = 10
    if (number > 0) {
        println("positive number")
    }else{
        println("negative number")
    }

    //when
    val day = 1
    when (day) {
        1 -> println("sunday")
        2 -> println("sunday")
        3 -> println("sunday")
        4 -> println("sunday")
        5 -> println("sunday")
        6 -> println("sunday")
        7 -> println("sunday")
        else -> println("invalid day")
    }

    //try-catch
    val value = "10"
    try{
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException){
        println("invalid number")
    }
}

fun Perulangan() {
    println()
    println("=== Prulangan ===")

    for (i in 1..5){
        println("perulangan ke-$i")
    }

    val cars = listOf("bmw","toyota","honda","audi")
    for (car in cars) {
        println("car type $car")
    }

    var x = 1
    while(x <= 5) {
        println("perulangan ke-$x")
        x++
    }

    var y = 1
    do {
        println("perulangan ke-$y")
        y++
    }while (y <= 5)
}

fun main() {
    ConditionalStatement()
    Perulangan()
}