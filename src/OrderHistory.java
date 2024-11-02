import java.util.ArrayList;

public class OrderHistory {
    private ArrayList<Order> orders;

    public OrderHistory() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayAllOrders() {
        for (Order order : orders) {
            order.displayOrder();
            System.out.println("------------");
        }
    }
}
