package com.example.mydesignsolidprinciples.solid.isp

// MultiFunctionPrinter - Implements Printer, Scanner, Fax
class MultiFunctionPrinter : Printer, Scanner, Fax {
    override fun printDocument(document: String) {
        println("Printing: $document")
    }

    override fun scanDocument(document: String) {
        println("Scanning: $document")
    }

    override fun faxDocument(document: String) {
        println("Faxing: $document")
    }
}
