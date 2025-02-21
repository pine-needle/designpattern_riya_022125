package com.example.mydesignsolidprinciples.behavioral.observer

// Concrete Observer 3
class WebsiteWidget : Subscriber {
    override fun update(news: String) {
        println("Website Widget: Latest News - $news")
    }
}
