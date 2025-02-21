package com.example.mydesignsolidprinciples.creational.abstractfactory.victorian

import com.example.mydesignsolidprinciples.creational.abstractfactory.Sofa

// Concrete Product: Victorian Sofa
class VictorianSofa : Sofa {
    override fun lieOn(): String {
        return "Lying on a Victorian Sofa."
    }
}
