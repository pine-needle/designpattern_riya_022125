package com.example.mydesignsolidprinciples.structural.bridge

// Refined Abstraction 1
class BasicRemote(device: Device) : RemoteControl(device) {
    override fun turnOn() {
        println("Basic Remote: Turn ON")
        device.turnOn()
    }

    override fun turnOff() {
        println("Basic Remote: Turn OFF")
        device.turnOff()
    }
}
