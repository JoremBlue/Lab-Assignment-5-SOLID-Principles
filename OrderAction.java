public class OrderAction implements Order {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}