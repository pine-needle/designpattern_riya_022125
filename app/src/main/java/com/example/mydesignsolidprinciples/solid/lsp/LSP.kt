package com.example.mydesignsolidprinciples.solid.lsp

fun calculateArea(shape: Shape) {
    println("Area: ${shape.area()}")
}

fun main() {
    val rect = Rectangle(5, 10)
    rect.setWidth(6)
    rect.setHeight(12)
    calculateArea(rect)    // Output: Area: 72

    val square = Square(5)
    square.setSide(6)
    calculateArea(square)  // Output: Area: 36
}
