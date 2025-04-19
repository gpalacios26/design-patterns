package structural.adapter.payment;

public class LegacyPaymentSystem {

    public void makePayment(String paymentDetails) {
        System.out.println("Procesando pago antiguo con detalles: " + paymentDetails);
    }
}
