package com.example.mydesignsolidprinciples.creational.abstractfactory.victorian

import com.example.mydesignsolidprinciples.creational.abstractfactory.Chair
import com.example.mydesignsolidprinciples.creational.abstractfactory.FurnitureFactory
import com.example.mydesignsolidprinciples.creational.abstractfactory.Sofa

// Concrete Factory: Victorian Furniture
class VictorianFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }
}
