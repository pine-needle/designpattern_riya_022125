package com.example.mydesignsolidprinciples.behavioral.observer

// Subject Interface
interface NewsAgency {
    fun subscribe(subscriber: Subscriber)
    fun unsubscribe(subscriber: Subscriber)
    fun notifySubscribers()
}
