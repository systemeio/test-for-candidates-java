package payment;

public interface PaymentProcessor {

    boolean payWithProcessor (double price) throws Exception;

    String name();
}
