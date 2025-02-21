package com.example.mydesignsolidprinciples.creational.abstractfactory.victorian

import com.example.mydesignsolidprinciples.creational.abstractfactory.Chair

// Concrete Product: Victorian Chair
class VictorianChair : Chair {
    override fun sitOn(): String {
        return "Sitting on a Victorian Chair."
    }
}
