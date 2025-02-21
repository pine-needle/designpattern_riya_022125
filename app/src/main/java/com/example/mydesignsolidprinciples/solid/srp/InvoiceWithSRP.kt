package com.example.mydesignsolidprinciples.solid.srp

// With SRP - Single Responsibility per Class
class InvoiceWithSRP(
    val items: List<Pair<String, Double>>
) {
    fun calculateTotal(): Double {
        var total = 0.0
        for (item in items) {
            total += item.second
        }
        return total
    }
}

// Separate Class for Printing
class InvoicePrinter(private val invoice: InvoiceWithSRP) {
    fun printInvoice() {
        println("=== Invoice ===")
        for (item in invoice.items) {
            println("${item.first}: $${item.second}")
        }
        println("Total: $${invoice.calculateTotal()}")
    }
}
