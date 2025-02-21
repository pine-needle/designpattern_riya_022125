package com.example.mydesignsolidprinciples.behavioral.iterator

// Concrete Aggregate Class
class PhotoGallery(private val photos: List<String>) : Collection<String> {
    override fun createIterator(): Iterator<String> {
        return ForwardIterator(photos)
    }

    fun createReverseIterator(): Iterator<String> {
        return ReverseIterator(photos)
    }
}
