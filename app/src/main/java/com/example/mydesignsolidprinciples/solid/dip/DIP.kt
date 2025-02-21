package com.example.mydesignsolidprinciples.solid.dip

fun main() {
    val paypalPayment = PaymentService(PayPalPaymentGateway())
    paypalPayment.makePayment(100.0)

    val stripePayment = PaymentService(StripePaymentGateway())
    stripePayment.makePayment(200.0)
}
