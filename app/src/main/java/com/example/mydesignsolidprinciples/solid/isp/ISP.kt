package com.example.mydesignsolidprinciples.solid.isp

fun main() {
    // Basic Printer - Only Prints
    val basicPrinter = BasicPrinter()
    basicPrinter.printDocument("Basic Document")

    // Multi-Function Printer - Prints, Scans, and Faxes
    val multiPrinter = MultiFunctionPrinter()
    multiPrinter.printDocument("Multi-Function Document")
    multiPrinter.scanDocument("Multi-Function Document")
    multiPrinter.faxDocument("Multi-Function Document")
}
