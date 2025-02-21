package com.example.mydesignsolidprinciples.solid.dip

// Low-Level Module - PayPal Payment Gateway
class PayPalPaymentGateway : PaymentGateway {
    override fun processPayment(amount: Double) {
        println("Processing payment of $$amount using PayPal.")
    }
}
