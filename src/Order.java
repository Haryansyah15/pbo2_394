import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Menu> menuItems;
    private String orderType;
    private String status;

    public Order(Customer customer, String orderType) {
        this.customer = customer;
        this.menuItems = new ArrayList<>();
        this.orderType = orderType;
        this.status = "In Progress";
    }

    public Customer getCustomer() { return customer; }
    public ArrayList<Menu> getMenuItems() { return menuItems; }
    public String getOrderType() { return orderType; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }


    public void addMenuItem(Menu menuItem) {
        menuItems.add(menuItem);
    }


    public double calculateTotal() {
        double total = 0;
        for (Menu item : menuItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Contact Info: " + customer.getContactInfo());
        System.out.println("Order Type: " + orderType);


        System.out.println("Menu Items:");
        for (Menu item : menuItems) {
            System.out.println("- " + item.getName() + " | Price: " + item.getPrice());
        }

        System.out.println("Total Price: " + calculateTotal());
        System.out.println("Status: " + status);
    }
}
