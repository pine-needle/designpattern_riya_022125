package com.example.mydesignsolidprinciples.solid.srp

// Without SRP - Multiple Responsibilities
class Invoice(
    private val items: List<Pair<String, Double>>
) {
    fun calculateTotal(): Double {
        var total = 0.0
        for (item in items) {
            total += item.second
        }
        return total
    }

    fun printInvoice() {
        println("=== Invoice ===")
        for (item in items) {
            println("${item.first}: $${item.second}")
        }
        println("Total: $${calculateTotal()}")
    }
}
