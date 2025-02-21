package com.example.mydesignsolidprinciples.creational.prototype

// Concrete Prototype Class
data class Stamp(
    var title: String,
    var date: String,
    var content: String
) : CloneablePrototype {
    override fun clone(): CloneablePrototype {
        // Shallow Copy
        return copy()
    }

    fun showDetails(): String {
        return "Title: $title, Date: $date, Content: $content"
    }
}
