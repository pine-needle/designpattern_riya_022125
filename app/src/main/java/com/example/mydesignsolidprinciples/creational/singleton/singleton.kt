package com.example.mydesignsolidprinciples.creational.singleton

fun main() {
    val instance1 = FavoriteFood
    val instance2 = FavoriteFood

    // both references point to the same instance
    println(instance1 === instance2)  // Output: true

    println(FavoriteFood.name)
}

object FavoriteFood{
    var name = "strawberry"
}