package com.example.mydesignsolidprinciples.solid.ocp

// Client Class
class ShapeDrawer {
    fun drawShapes(shapes: List<Shape>) {
        for (shape in shapes) {
            shape.draw()
        }
    }
}
