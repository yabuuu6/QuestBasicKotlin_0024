package com.example.questbasickotlin_0024

//List adalah kumpulan data yang disusun secara berurutan dari
//List bersifat ordered , artinya data yang di masukkan akan memiliki posisi sesuai urutan
//List bersifat muteable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat di ubah
//list read only menggunakan listof
// list muteable menggunakan muteablelistof

fun ContohList() {
    println("=== List ===")
    //list read only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //list muteable
    val shape: MutableList<String> = mutableListOf("circle","square","triangle")
    println(shape)

    shape.add("circle")
    println(shape)

    shape.remove("circle")
    println(shape)

    shape[0] = "oval"
    println(shape)

    val shapeLocked: List<String> = shape
    println(shapeLocked)

}

//set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik tidak ad duplikasi
//set berisifat unordered artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat muteable dan read only ,artinya data yang di masukkan dapat diubah dan tidak dapat diubah
//set read only menggunakan setOf
//set muteable menggunakan muteablesetof

fun ContohSet(){
    println()
    println("=== Set ===")

    //setread only
    val readOnlyAbjad = setOf("A","B","C")
    println(readOnlyAbjad)

    //set muteable
    val shape: MutableSet<String> = mutableSetOf("circle","square","triangle")
    println(shape)

    //menggunakan data ke dalam set muteable
    shape.add("rectangle")

    //menghapus data dari set mutable
    shape.remove("circle")
    println(shape)

    //set read only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

//map adalah kumpulan data yang disusun dalam pasangan value
//map bersifat unordered : artinya data yang di masukkan tidak memiliki posisi tertentu
//map bersifat mutable dan read only : artinya data yang dimasukkan dapat di ubah dan tidak dapat di ubah
//map read only menggunakan mapof
//map mutable menggunakan mutableof


fun ContohMap() {
    println()
    println("=== Map ===")
    //map read only
    val readOnlyShape: Map<String,Int> = mapOf("circle" to 1,"square" to 2,"triangle" to 3)
    println(readOnlyShape)
    //map mutablle
    val shape: MutableMap<String, Int> = mutableMapOf("circle" to 1,"square" to 2,"triangle" to 3)
    println(shape)
    //menambahkan data ke dalam map muteable
    shape["rectangle"] = 4
    println(shape)

    //menghapus data dari map muteable
    shape.remove("circle")
    println(shape)
    //mengubah data di dalam map mutable
    shape["square"] = 5
    println(shape)

    //map read only
    val shapesLocked: Map<String,Int> = shape
    println(shapesLocked)

}
fun main(){
    ContohSet()
    ContohList()
    ContohMap()
}