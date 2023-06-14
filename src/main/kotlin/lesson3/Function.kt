package lesson3

import java.util.concurrent.TimeUnit

/*

function/method

fun+name(camel case) + parametr(optional)

 */

val products = listOf("apple", "orange", "pineapple")
val prices = listOf(20,30,40)
val amounts = listOf(1,1,3)

fun main(){

//    myFirstFunction("Elli")
//print( greeting("Masha"))
    for (i in products.indices) {
        println(countTotalPrice(amount = amounts[i], pricePerUnit = prices[i], title = products[i]))
    }
}

fun countTotalPrice(amount : Int = 1, pricePerUnit: Int, title: String): String{
    val totalPrice = veryfyAmount(amount) * pricePerUnit
    val result = "you've bought $amount $title. \n$pricePerUnit$ per unit. \nTotal price = $totalPrice$\n"
    return result
}

fun veryfyAmount(amount: Int): Int{
    return when{
        amount <= 1 -> 1
        else -> amount
    }
}



fun myFirstFunction(name: String): Unit{
    println("Hi $name")
}

fun greeting(name: String): String{
    val result = "hello, $name"
    return result
}