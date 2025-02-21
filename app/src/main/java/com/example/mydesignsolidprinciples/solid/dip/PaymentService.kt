package com.example.mydesignsolidprinciples.solid.dip

// High-Level Module - PaymentService
class PaymentService(private val paymentGateway: PaymentGateway) {

    fun makePayment(amount: Double) {
        paymentGateway.processPayment(amount)
    }
}
