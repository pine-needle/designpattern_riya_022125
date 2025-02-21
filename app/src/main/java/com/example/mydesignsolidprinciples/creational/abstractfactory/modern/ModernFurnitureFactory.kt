package com.example.mydesignsolidprinciples.creational.abstractfactory.modern

import com.example.mydesignsolidprinciples.creational.abstractfactory.Chair
import com.example.mydesignsolidprinciples.creational.abstractfactory.FurnitureFactory
import com.example.mydesignsolidprinciples.creational.abstractfactory.Sofa

// Concrete Factory: Modern Furniture
class ModernFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}
