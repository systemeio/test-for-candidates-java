package payment;

public class StripePaymentProcessor implements PaymentProcessor {

    //TODO реализовать метод “pay”, который принимает цену c типом Float и  возвращает false,
    // если цена меньше 100 и true в остальных случаях
    private boolean pay(Float price) {
        return price >= 100;
    }

    @Override
    public boolean payWithProcessor(double price) {
        //TODO
        return pay((float) price);
    }

    @Override
    public String name() {
        return "stripe";
    }
}
