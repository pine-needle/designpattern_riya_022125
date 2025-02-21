package com.example.mydesignsolidprinciples.structural.bridge

fun main() {
    // Using Bridge Pattern with TV and Basic Remote
    val tv = TV()
    val basicRemote = BasicRemote(tv)
    basicRemote.turnOn()
    basicRemote.setVolume(15)
    basicRemote.turnOff()

    // Using Bridge Pattern with Radio and Advanced Remote
    val radio = Radio()
    val advancedRemote = AdvancedRemote(radio)
    advancedRemote.turnOn()
    advancedRemote.setVolume(20)
    advancedRemote.mute()
    advancedRemote.turnOff()
}
