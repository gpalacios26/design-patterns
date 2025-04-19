package structural.adapter.payment;

public class ModernPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago moderno: $" + amount);
    }
}
