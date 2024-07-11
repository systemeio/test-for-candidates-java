package io.systeme.interview_coding.payment;

public class StripePaymentProcessor {

    public boolean pay(Float price) {
        return price >= 100;
    }

}
