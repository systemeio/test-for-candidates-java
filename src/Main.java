import payment.PaypalPaymentProcessor;
import payment.StripePaymentProcessor;

public class Main {
    public static void main(String[] args) {
        Request request = new Request(10000.0, "paypal");
        boolean success;
        int statusCode;
        String message;

        //TODO обработать запрос и возможные ошибки
        try {
            if (request.price() < 0) {
                throw new IllegalArgumentException("Price must be greater than zero");
            }
            switch (request.paymentProcessor()) {
                case "paypal" -> {
                    new PaypalPaymentProcessor().makePayment((int) request.price());
                    success = true;
                }
                case "stripe" -> success = new StripePaymentProcessor().pay((float) request.price());
                default -> throw new IllegalArgumentException("Unknown PaymentProcessor");
            }
            if (success) {
                statusCode = 200;
                message = "Payment successful";
            } else {
                throw new Exception("Unsuccessful Payment");
            }
        } catch (Exception e) {
            statusCode = 400;
            message = e.getMessage();
        }

        Response response = new Response(statusCode, message);

        System.out.println(response);
    }
}

record Request(double price, String paymentProcessor) {}
record Response(int statusCode, String message) {}