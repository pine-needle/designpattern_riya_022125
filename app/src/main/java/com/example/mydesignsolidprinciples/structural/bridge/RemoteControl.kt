package com.example.mydesignsolidprinciples.structural.bridge

// Abstraction
abstract class RemoteControl(protected val device: Device) {
    open fun turnOn() {
        device.turnOn()
    }

    open fun turnOff() {
        device.turnOff()
    }

    open fun setVolume(level: Int) {
        device.setVolume(level)
    }
}
