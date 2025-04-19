package structural.adapter;

import structural.adapter.payment.LegacyPaymentSystem;
import structural.adapter.payment.ModernPaymentProcessor;
import structural.adapter.payment.LegacyPaymentAdapter;
import structural.adapter.payment.PaymentProcessor;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor modernProcessor = new ModernPaymentProcessor();
        modernProcessor.processPayment(100);

        PaymentProcessor legacyAdapter = new LegacyPaymentAdapter(new LegacyPaymentSystem());
        legacyAdapter.processPayment(100);
    }
}
