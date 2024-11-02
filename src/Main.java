public class Main {
    public static void main(String[] args) {

        RestaurantManagementSystem system = new RestaurantManagementSystem();


        FoodMenu nasiGoreng = new FoodMenu("Nasi Goreng", 14000, true);
        FoodMenu mieGoreng = new FoodMenu("Mie Goreng", 10000, true);
        FoodMenu ayamBakar = new FoodMenu("Ayam Bakar", 20000, false);
        FoodMenu sateAyam = new FoodMenu("Sate Ayam", 25000, false);


        DrinkMenu esTeh = new DrinkMenu("Es Teh", 5000, true);
        DrinkMenu esJeruk = new DrinkMenu("Es Jeruk", 7000, true);
        DrinkMenu esCampur = new DrinkMenu("Es Campur", 13000, false);
        DrinkMenu jusMangga = new DrinkMenu("Jus Mangga", 8000, true);


        system.addMenu(nasiGoreng);
        system.addMenu(mieGoreng);
        system.addMenu(ayamBakar);
        system.addMenu(sateAyam);
        system.addMenu(esTeh);
        system.addMenu(esJeruk);
        system.addMenu(esCampur);
        system.addMenu(jusMangga);


        System.out.println("=== Menu Restoran ===");
        system.displayMenu();


        Customer customer1 = new Customer("Fuad", "08123456789");
        Order order1 = new Order(customer1, "Dine-in");
        order1.addMenuItem(nasiGoreng);
        order1.addMenuItem(esTeh);
        order1.addMenuItem(sateAyam);
        system.getOrderHistory().addOrder(order1);

        Customer customer2 = new Customer("Ilham", "08234567890");
        Order order2 = new Order(customer2, "Take-away");
        order2.addMenuItem(mieGoreng);
        order2.addMenuItem(jusMangga);
        order2.addMenuItem(esCampur);
        system.getOrderHistory().addOrder(order2);

        Customer customer3 = new Customer("Habiby", "08234567890");
        Order order3 = new Order(customer3, "Take-away");
        order3.addMenuItem(ayamBakar);
        order3.addMenuItem(esJeruk);
        order3.addMenuItem(esCampur);
        system.getOrderHistory().addOrder(order3);


        System.out.println("\n=== Riwayat Pesanan ===");
        system.showOrderHistory();
    }
}
