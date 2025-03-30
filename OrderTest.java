public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        InvoiceGenerator invoiceGenerator = new PDFInvoiceGenerator();
        NotificationService notificationService = new EmailNotificationService();

        OrderProcessor orderProcessor = new OrderProcessor(order, invoiceGenerator, notificationService);
        orderProcessor.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}