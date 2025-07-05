public class App {
    public static void main(String[] args) throws Exception {
        Cheese cheese = new Cheese("Cheddar", 100, 5, 0.5, false);
        Tv tv = new Tv("Samsung TV", 3000, 2, 10);

        Customer customer = new Customer("Malak", 5000);

        customer.getCart().addProduct(cheese, 2);
        customer.getCart().addProduct(tv, 1);

        customer.getCart().showCart();
        customer.checkout(); 
    }
}
