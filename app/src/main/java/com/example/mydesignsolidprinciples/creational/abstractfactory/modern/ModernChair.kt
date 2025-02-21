package com.example.mydesignsolidprinciples.creational.abstractfactory.modern

import com.example.mydesignsolidprinciples.creational.abstractfactory.Chair

// Concrete Product: Modern Chair
class ModernChair : Chair {
    override fun sitOn(): String {
        return "Sitting on a Modern Chair."
    }
}
