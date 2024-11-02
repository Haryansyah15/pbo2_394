public class DrinkMenu extends Menu {
    private boolean Dingin;

    public DrinkMenu(String name, double price, boolean Dingin) {
        super(name, price);
        this.Dingin = Dingin;
    }

    public boolean isDingin() { return Dingin; }
    public void setDingin(boolean Dingin) { this.Dingin = Dingin; }

    @Override
    public void displayMenu() {
        System.out.println("Drink: " + getName() + " | Price: " + getPrice() + " | Dingin: " + (Dingin ? "Ya" : "Tidak"));
    }
}
