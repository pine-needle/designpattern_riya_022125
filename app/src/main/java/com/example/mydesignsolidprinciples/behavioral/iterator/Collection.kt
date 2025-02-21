package com.example.mydesignsolidprinciples.behavioral.iterator

// Aggregate Interface
interface Collection<T> {
    fun createIterator(): Iterator<T>
}
