package com.example.mydesignsolidprinciples.structural.bridge

// Concrete Implementor 2
class Radio : Device {
    private var volume = 5

    override fun turnOn() {
        println("Radio is turned ON.")
    }

    override fun turnOff() {
        println("Radio is turned OFF.")
    }

    override fun setVolume(level: Int) {
        volume = level
        println("Radio volume set to $volume.")
    }
}
