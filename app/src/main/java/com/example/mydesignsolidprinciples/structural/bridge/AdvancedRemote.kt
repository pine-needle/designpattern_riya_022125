package com.example.mydesignsolidprinciples.structural.bridge

// Refined Abstraction 2
class AdvancedRemote(device: Device) : RemoteControl(device) {
    fun mute() {
        println("Advanced Remote: Mute")
        device.setVolume(0)
    }
}
