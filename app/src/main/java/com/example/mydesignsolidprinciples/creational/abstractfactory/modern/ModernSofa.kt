package com.example.mydesignsolidprinciples.creational.abstractfactory.modern

import com.example.mydesignsolidprinciples.creational.abstractfactory.Sofa

// Concrete Product: Modern Sofa
class ModernSofa : Sofa {
    override fun lieOn(): String {
        return "Lying on a Modern Sofa."
    }
}
