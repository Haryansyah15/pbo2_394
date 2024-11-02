public class FoodMenu extends Menu {
    private boolean Pedas;

    public FoodMenu(String name, double price, boolean Pedas) {
        super(name, price);
        this.Pedas = Pedas;
    }

    public boolean isSpicy() { return Pedas; }
    public void setSpicy(boolean isSpicy) { this.Pedas = Pedas; }

    @Override
    public void displayMenu() {
        System.out.println("Food: " + getName() + " | Price: " + getPrice() + " | Pedas: " + (Pedas ? "Ya" : "Tidak"));
    }
}
