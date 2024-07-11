import payment.Paypal;
import payment.StripePaymentProcessor;

public class Main {
    public static void main(String[] args) {
        Request request = new Request(100.0, "stripe");
        boolean success;
        int statusCode;
        String message;
        try {
            switch (request.paymentProcessor()) {
                case "paypal" -> success = new Paypal().payWithProcessor(request.price());
                case "stripe" -> success = new StripePaymentProcessor().payWithProcessor(request.price());
                default -> throw new Exception("Unknown PaymentProcessor");
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