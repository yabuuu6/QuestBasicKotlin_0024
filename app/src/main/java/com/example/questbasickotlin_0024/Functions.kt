package com.example.questbasickotlin_0024


fun withoutParameter() {
    println("=== withoutparameter===")
    println("hello world")
}

fun withParameter(name: String) {
    println()
    println("===with parameter")
    println("hello $name")
}


//name argumen merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name:String, age:Int) {
    println()
    println("===withnamedargument===")
    println("Hello, $name: you are $age years old")
}


fun withDefaultParameter(name: String = "yabuuu", age:Int) {
    println()
    println("===withdefaultargument===")
    println("'Hello ,$name you are $age years old")
}


fun withReturn(panjang: Int, lebar: Int): Int {
    val hasil = panjang * lebar
    println(hasil)
    return hasil
}



fun main() {
    withoutParameter()
    withParameter("ojan")
    withNamedArgument(name = "ojan", age = 20)
    withDefaultParameter(age = 20)
    withReturn(panjang = 10, lebar = 10)
}