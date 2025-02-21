package com.example.mydesignsolidprinciples.behavioral.observer

// Concrete Observer 2
class EmailAlert : Subscriber {
    override fun update(news: String) {
        println("Email Alert: You have a new email - $news")
    }
}
