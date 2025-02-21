package com.example.mydesignsolidprinciples.solid.lsp

// Concrete Class - Rectangle
class Rectangle(private var width: Int, private var height: Int) : Shape() {

    override fun area(): Int {
        return width * height
    }

    fun setWidth(width: Int) {
        this.width = width
    }

    fun setHeight(height: Int) {
        this.height = height
    }

    fun getWidth(): Int = width
    fun getHeight(): Int = height
}
