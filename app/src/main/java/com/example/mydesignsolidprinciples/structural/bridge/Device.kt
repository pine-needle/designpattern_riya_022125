package com.example.mydesignsolidprinciples.structural.bridge

// Implementor Interface
interface Device {
    fun turnOn()
    fun turnOff()
    fun setVolume(level: Int)
}
