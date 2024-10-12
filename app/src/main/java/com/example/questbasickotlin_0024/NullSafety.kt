package com.example.questbasickotlin_0024

fun nullSafety() {
    //never null has string type
    var neverNull:String = "This can't be null"

    //throws a compiler erorr
    //never null = null


    //nullable has nullable string type
    var nullable: String? = "you can keep a null here"
    //this oke
    nullable = null

    //chechk for null in conditions
    if (neverNull == null) {
        println("inferredNonNUll is null")
    }else{
        println("inferredNonNUll is not null")
    }


    //safe call operator
    println(neverNull.length)//18
    println(nullable?.length)//null


    //not NUll doesnt accept null value
    fun strLength(notNull:String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
}

fun main() {
    nullSafety()
}