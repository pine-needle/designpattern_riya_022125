package com.example.mydesignsolidprinciples.behavioral.observer

// Concrete Subject Class
class NewsPublisher : NewsAgency {
    private val subscribers = mutableListOf<Subscriber>()
    private var latestNews: String = ""

    override fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun notifySubscribers() {
        for (subscriber in subscribers) {
            subscriber.update(latestNews)
        }
    }

    fun publishNews(news: String) {
        latestNews = news
        notifySubscribers()
    }
}
