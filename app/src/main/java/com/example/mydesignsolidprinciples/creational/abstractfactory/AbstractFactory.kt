package com.example.mydesignsolidprinciples.creational.abstractfactory

import com.example.mydesignsolidprinciples.creational.abstractfactory.modern.ModernFurnitureFactory
import com.example.mydesignsolidprinciples.creational.abstractfactory.victorian.VictorianFurnitureFactory

fun main() {
    // Using Abstract Factory Pattern
    val modernFactory: FurnitureFactory = ModernFurnitureFactory()
    val modernChair: Chair = modernFactory.createChair()
    val modernSofa: Sofa = modernFactory.createSofa()
    println(modernChair.sitOn())
    println(modernSofa.lieOn())

    val victorianFactory: FurnitureFactory = VictorianFurnitureFactory()
    val victorianChair: Chair = victorianFactory.createChair()
    val victorianSofa: Sofa = victorianFactory.createSofa()
    println(victorianChair.sitOn())
    println(victorianSofa.lieOn())
}
