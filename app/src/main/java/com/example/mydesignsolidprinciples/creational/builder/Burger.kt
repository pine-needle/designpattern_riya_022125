package com.example.mydesignsolidprinciples.creational.builder

// Product Class
class Burger private constructor(
    val bread: String?,
    val patty: String?,
    val cheese: Boolean,
    val lettuce: Boolean,
    val tomato: Boolean,
    val pickles: Boolean
) {
    // Showing Burger Details
    fun showDetails(): String {
        return "Burger with $bread bread, $patty patty, " +
                (if (cheese) "Cheese, " else "") +
                (if (lettuce) "Lettuce, " else "") +
                (if (tomato) "Tomato, " else "") +
                (if (pickles) "Pickles" else "")
    }

    // Builder Class
    class Builder {
        private var bread: String? = null
        private var patty: String? = null
        private var cheese: Boolean = false
        private var lettuce: Boolean = false
        private var tomato: Boolean = false
        private var pickles: Boolean = false

        fun setBread(bread: String) = apply { this.bread = bread }
        fun setPatty(patty: String) = apply { this.patty = patty }
        fun addCheese() = apply { this.cheese = true }
        fun addLettuce() = apply { this.lettuce = true }
        fun addTomato() = apply { this.tomato = true }
        fun addPickles() = apply { this.pickles = true }

        fun build(): Burger {
            return Burger(bread, patty, cheese, lettuce, tomato, pickles)
        }
    }
}
