package com.example.mydesignsolidprinciples.solid.isp

// BasicPrinter - Implements Printer Only
class BasicPrinter : Printer {
    override fun printDocument(document: String) {
        println("Printing: $document")
    }
}
