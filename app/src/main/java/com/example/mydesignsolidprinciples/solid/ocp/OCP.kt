package com.example.mydesignsolidprinciples.solid.ocp

fun main() {
    // Creating Shapes
    val circle = Circle()
    val rectangle = Rectangle()
    val triangle = Triangle()

    // Adding Shapes to a List
    val shapes = listOf(circle, rectangle, triangle)

    // Drawing Shapes using ShapeDrawer (Client Class)
    val shapeDrawer = ShapeDrawer()
    shapeDrawer.drawShapes(shapes)
}
