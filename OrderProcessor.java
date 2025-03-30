public class OrderProcessor {
    private final Order order;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationService notificationService;

    public OrderProcessor(Order order, InvoiceGenerator invoiceGenerator, NotificationService notificationService) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = order.calculateTotal(price, quantity);
        System.out.println("Order Total: $" + total);
        order.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        notificationService.sendEmailNotification(email);
    }
}