import java.util.ArrayList;

public class Order {
    ArrayList<OrderItem> orderItems = new ArrayList<>();
    double taxRate = 0.1; // Pajak 10%
    double serviceChargeRate = 0.05; // Biaya layanan 5%

    public void addItem(MenuItem menuItem, int quantity) {
        OrderItem orderItem = new OrderItem(menuItem, quantity);
        orderItems.add(orderItem);
    }


    public double calculateSubtotal() {
        double subtotal = 0;
        for (OrderItem item : orderItems) {
            subtotal += item.totalPrice;
        }
        return subtotal;
    }

    public double calculateTax() {
        return calculateSubtotal() * taxRate;
    }

    public double calculateServiceCharge() {
        return calculateSubtotal() * serviceChargeRate;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax() + calculateServiceCharge();
    }

    public void printReceipt() {
        System.out.println("Nota Pemesanan:");
        for (OrderItem item : orderItems) {
            System.out.printf("%s x %d = Rp %.2f\n", item.menuItem.name, item.quantity, item.totalPrice);
        }
        System.out.printf("\nSubtotal: Rp %.2f\n", calculateSubtotal());
        System.out.printf("Pajak: Rp %.2f\n", calculateTax());
        System.out.printf("Biaya Layanan: Rp %.2f\n", calculateServiceCharge());
        System.out.printf("Total: Rp %.2f\n", calculateTotal());
    }
}
