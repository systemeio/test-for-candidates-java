

public class Main {
    public static void main(String[] args) {
        Request request = new Request(10000.0, "paypal");
        boolean success;
        int statusCode;
        String message;

        //TODO обработать запрос и возможные ошибки

        Response response = new Response(statusCode, message);

        System.out.println(response);
    }
}

record Request(double price, String paymentProcessor) {}
record Response(int statusCode, String message) {}