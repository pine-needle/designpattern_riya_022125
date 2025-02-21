package com.example.mydesignsolidprinciples.behavioral.iterator

// Concrete Iterator: Reverse Iterator
class ReverseIterator<T>(private val items: List<T>) : Iterator<T> {
    private var index = items.size - 1

    override fun hasNext(): Boolean {
        return index >= 0
    }

    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException("No more elements")
        }
        return items[index--]
    }
}
