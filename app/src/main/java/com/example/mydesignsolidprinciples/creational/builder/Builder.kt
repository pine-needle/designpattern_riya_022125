package com.example.mydesignsolidprinciples.creational.builder

fun main() {
    // Building a Custom Burger using Builder Pattern
    val burger1 = Burger.Builder()
        .setBread("Whole Wheat")
        .setPatty("Veggie")
        .addCheese()
        .addLettuce()
        .build()

    val burger2 = Burger.Builder()
        .setBread("White")
        .setPatty("Beef")
        .addTomato()
        .addPickles()
        .build()

    println(burger1.showDetails())  // Burger with Whole Wheat bread, Veggie patty, Cheese, Lettuce
    println(burger2.showDetails())  // Burger with White bread, Beef patty, Tomato, Pickles
}
