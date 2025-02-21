package com.example.mydesignsolidprinciples.creational.factory

// Base Class
abstract class Pizza {
    abstract fun prepare(): String
}
// Concrete Class 1
class Margherita : Pizza() {
    override fun prepare(): String {
        return "Preparing Margherita Pizza with Cheese and Tomato."
    }
}

// Concrete Class 2
class Pepperoni : Pizza() {
    override fun prepare(): String {
        return "Preparing Pepperoni Pizza with Spicy Sausage."
    }
}

// Concrete Class 3
class Veggie : Pizza() {
    override fun prepare(): String {
        return "Preparing Veggie Pizza with Bell Peppers and Olives."
    }
}

// Factory Class
object PizzaFactory {
    fun createPizza(type: String): Pizza {
        return when (type) {
            "Margherita" -> Margherita()
            "Pepperoni" -> Pepperoni()
            "Veggie" -> Veggie()
            else -> throw IllegalArgumentException("Unknown Pizza Type")
        }
    }
}

fun main() {
    // Using Factory Pattern to create pizzas
    val margherita: Pizza = PizzaFactory.createPizza("Margherita")
    println(margherita.prepare())  // Output: Preparing Margherita Pizza with Cheese and Tomato.

    val pepperoni: Pizza = PizzaFactory.createPizza("Pepperoni")
    println(pepperoni.prepare())   // Output: Preparing Pepperoni Pizza with Spicy Sausage.

    val veggie: Pizza = PizzaFactory.createPizza("Veggie")
    println(veggie.prepare())      // Output: Preparing Veggie Pizza with Bell Peppers and Olives.
}
