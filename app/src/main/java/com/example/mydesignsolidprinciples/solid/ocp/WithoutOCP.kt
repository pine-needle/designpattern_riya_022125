package com.example.mydesignsolidprinciples.solid.ocp

// Without OCP - Tightly Coupled
enum class ShapeType {
    CIRCLE, RECTANGLE, TRIANGLE
}

class ShapeWithoutOCP(
    private val type: ShapeType
) {
    fun draw() {
        when (type) {
            ShapeType.CIRCLE -> println("Drawing a Circle")
            ShapeType.RECTANGLE -> println("Drawing a Rectangle")
            ShapeType.TRIANGLE -> println("Drawing a Triangle")
        }
    }
}

fun main() {
    val circle = ShapeWithoutOCP(ShapeType.CIRCLE)
    val rectangle = ShapeWithoutOCP(ShapeType.RECTANGLE)
    val triangle = ShapeWithoutOCP(ShapeType.TRIANGLE)

    circle.draw()
    rectangle.draw()
    triangle.draw()
}
