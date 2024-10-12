package com.example.questbasickotlin_0024

//data class adalah class yang di gunakan untuk menyimpan data,
//data class menyediakan fungsi untuk meng override fungsi equals(),hashCode(),dan toString(),
//data class juga menyediakan fungsi Copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "yabuuu@gmail.com")
    println(data)

    //fungsi Equals
    val data2 = DataClass(1, "ybbbb@gmail.com")
    println(data == data2)//false

    //fungsi copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "mantap@gmail.com")
    println(data4)
}