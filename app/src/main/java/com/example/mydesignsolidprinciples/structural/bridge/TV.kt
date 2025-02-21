package com.example.mydesignsolidprinciples.structural.bridge

// Concrete Implementor 1
class TV : Device {
    private var volume = 10

    override fun turnOn() {
        println("TV is turned ON.")
    }

    override fun turnOff() {
        println("TV is turned OFF.")
    }

    override fun setVolume(level: Int) {
        volume = level
        println("TV volume set to $volume.")
    }
}
