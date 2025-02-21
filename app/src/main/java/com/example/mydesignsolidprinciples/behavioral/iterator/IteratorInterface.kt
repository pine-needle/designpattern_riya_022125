package com.example.mydesignsolidprinciples.behavioral.iterator

// Iterator Interface
interface IteratorInterface<T> {
    fun hasNext(): Boolean
    fun next(): T
}
