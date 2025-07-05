public class Customer {
    private String name;
    private double balance;
    private Cart cart;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public void checkout() {
        if (cart == null || cart.sumTotal() == 0) {
            System.out.println("cart is empty");
            return;
        }

      
        for (int i = 0; i < cart.getProducts().size(); i++) {
            Products p = cart.getProducts().get(i);
            if (p instanceof Expirable) {
                Expirable e = (Expirable) p;
                if (e.isExpired()) {
                    System.out.println("Don't allow to buy" + p.getName() + " because it is expired.");
                    return;
                }
            }
        }

        double total = cart.sumTotal();
        double shippingFee = cart.sumWeight() * 10;
        double totalToPay = total + shippingFee;

        if (balance < totalToPay) {
            System.out.println("your balance is not enough to pay for this order.");
            return;
        }

        balance -= totalToPay;

        System.out.println("your proccess is done  " + name);
        System.out.println("Subtotal: " + total);
        System.out.println("Shipping Fee: " + shippingFee);
        System.out.println("Total Paid: " + totalToPay);
        System.out.println("Remaining Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

