package com.example.mydesignsolidprinciples.behavioral.iterator

fun main() {
    // Creating the Photo Gallery
    val photos = listOf(
        "Photo1.jpg",
        "Photo2.jpg",
        "Photo3.jpg",
        "Photo4.jpg",
        "Photo5.jpg"
    )
    val photoGallery = PhotoGallery(photos)

    // Iterating in Forward Order
    println("=== Forward Order ===")
    val forwardIterator = photoGallery.createIterator()
    while (forwardIterator.hasNext()) {
        println(forwardIterator.next())
    }

    // Iterating in Reverse Order
    println("\n=== Reverse Order ===")
    val reverseIterator = photoGallery.createReverseIterator()
    while (reverseIterator.hasNext()) {
        println(reverseIterator.next())
    }
}
