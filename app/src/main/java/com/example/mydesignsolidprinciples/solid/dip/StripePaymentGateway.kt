package com.example.mydesignsolidprinciples.solid.dip

// Low-Level Module - Stripe Payment Gateway
class StripePaymentGateway : PaymentGateway {
    override fun processPayment(amount: Double) {
        println("Processing payment of $$amount using Stripe.")
    }
}
