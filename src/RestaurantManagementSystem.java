import java.util.ArrayList;

public class RestaurantManagementSystem {
    private ArrayList<Menu> menuList;
    private OrderHistory orderHistory;

    public RestaurantManagementSystem() {
        menuList = new ArrayList<>();
        orderHistory = new OrderHistory();
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void displayMenu() {
        for (Menu menu : menuList) {
            menu.displayMenu();
        }
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }

    public void showOrderHistory() {
        orderHistory.displayAllOrders();
    }
}
