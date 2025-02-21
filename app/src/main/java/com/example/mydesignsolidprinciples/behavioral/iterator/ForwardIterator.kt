package com.example.mydesignsolidprinciples.behavioral.iterator

// Concrete Iterator: Forward Iterator
class ForwardIterator<T>(private val items: List<T>) : Iterator<T> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < items.size
    }

    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException("No more elements")
        }
        return items[index++]
    }
}
