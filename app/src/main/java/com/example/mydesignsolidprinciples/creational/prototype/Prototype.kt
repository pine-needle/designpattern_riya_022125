package com.example.mydesignsolidprinciples.creational.prototype

fun main() {
    // Creating an Original Stamp
    val originalStamp = Stamp(
        title = "Official Document",
        date = "2025-02-21",
        content = "This is the original document."
    )
    println("Original Stamp: ${originalStamp.showDetails()}")

    // Cloning the Original Stamp
    val clonedStamp = originalStamp.clone() as Stamp
    clonedStamp.date = "2025-02-22"  // Modifying the date in the cloned Stamp
    clonedStamp.content = "This is the cloned document."

    println("Cloned Stamp: ${clonedStamp.showDetails()}")
    println("Original Stamp after Cloning: ${originalStamp.showDetails()}")
}
