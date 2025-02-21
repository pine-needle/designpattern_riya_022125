package com.example.mydesignsolidprinciples.solid.lsp

// Concrete Class - Square
class Square(private var side: Int) : Shape() {

    override fun area(): Int {
        return side * side
    }

    fun setSide(side: Int) {
        this.side = side
    }

    fun getSide(): Int = side
}
