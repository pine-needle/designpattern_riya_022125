package com.example.mydesignsolidprinciples.solid.dip

// Abstraction - Payment Gateway
interface PaymentGateway {
    fun processPayment(amount: Double)
}
