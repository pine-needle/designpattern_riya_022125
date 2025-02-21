package com.example.mydesignsolidprinciples.solid.srp

fun main() {
    val items = listOf(
        "Item 1" to 10.0,
        "Item 2" to 20.0,
        "Item 3" to 30.0
    )

    // Without SRP
    val invoice = Invoice(items)
    invoice.printInvoice()

    // With SRP
    val invoiceWithSRP = InvoiceWithSRP(items)
    val printer = InvoicePrinter(invoiceWithSRP)
    printer.printInvoice()
}
