package com.example.mydesignsolidprinciples.behavioral.observer

fun main() {
    // Creating the Subject (News Publisher)
    val newsPublisher = NewsPublisher()

    // Creating Observers (Subscribers)
    val mobileApp = MobileApp()
    val emailAlert = EmailAlert()
    val websiteWidget = WebsiteWidget()

    // Subscribing to the News Publisher
    newsPublisher.subscribe(mobileApp)
    newsPublisher.subscribe(emailAlert)
    newsPublisher.subscribe(websiteWidget)

    // Publishing News
    newsPublisher.publishNews("Breaking News: Observer Pattern Explained!")
    newsPublisher.publishNews("Latest Update: Kotlin Design Patterns Made Easy!")

    // Unsubscribing one Observer
    newsPublisher.unsubscribe(emailAlert)

    // Publishing More News
    newsPublisher.publishNews("Exclusive: Advanced Kotlin Tips and Tricks!")
}
