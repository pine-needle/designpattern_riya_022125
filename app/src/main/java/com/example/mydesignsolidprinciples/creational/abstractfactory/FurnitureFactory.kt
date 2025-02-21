package com.example.mydesignsolidprinciples.creational.abstractfactory

// Abstract Factory
interface FurnitureFactory {
    fun createChair(): Chair
    fun createSofa(): Sofa
}
