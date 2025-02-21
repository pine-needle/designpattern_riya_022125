package com.example.mydesignsolidprinciples.behavioral.observer

// Concrete Observer 1
class MobileApp : Subscriber {
    override fun update(news: String) {
        println("Mobile App: New Update - $news")
    }
}
