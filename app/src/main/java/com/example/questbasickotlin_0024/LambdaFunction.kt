package com.example.questbasickotlin_0024

//Lambda Functions adalah fungsi yang tidak memiliki nama
//lambda functions bisanya di gunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunkan tanda panah -> untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String):String {
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString("hello")
    println({string: String -> string.uppercase()}("hello"))
}
