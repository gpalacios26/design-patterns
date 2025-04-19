package structural.adapter.payment;

/**
 * Patrón Adapter
 * Propósito: Permitir que dos interfaces incompatibles trabajen juntas proporcionando un "adaptador" entre ellas.
 */
public class LegacyPaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentSystem legacyPaymentSystem;

    public LegacyPaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        String paymentDetails = "Pago de $" + amount;
        legacyPaymentSystem.makePayment(paymentDetails);
    }
}
