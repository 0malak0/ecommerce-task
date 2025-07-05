import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Products> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
    public List<Products> getProducts() {
    return products;
}

public List<Integer> getQuantities() {
    return quantities;
}


    public void addProduct(Products product, int quantity) {
        if (!product.isAvailable(quantity)) {
            System.out.println("this quantity is not available for " + product.getName());
            
        }

        products.add(product);
        quantities.add(quantity);
        product.reduceQuantity(quantity);
    }
    public double sumTotal(){
           double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }

       return total; 
    }
    public double sumWeight(){
        double totalWeight = 0;
        for (int i = 0; i < products.size(); i++) {
            totalWeight += products.get(i).getWeight() * quantities.get(i);
        }
        return totalWeight;
    }
    public void showCart() {
        if (products.isEmpty()) {
            System.out.println("cart is empty");
            return;
        }
         for (int i = 0; i < products.size(); i++) {
            System.out.println(  quantities.get(i)+"   " + products.get(i).getName() + products.get(i).getWeight()* quantities.get(i) );
        }
        System.out.println("** Shipment notice **");
        System.out.println("Total weight is " + sumWeight() );
        for (int i = 0; i < products.size(); i++) {
            System.out.println(  quantities.get(i)+"   " + products.get(i).getName() +products.get(i).getPrice()* quantities.get(i) );
        }
         System.out.println("** Checkout receipt **");
        System.out.println("Total is " + sumTotal() );
    }
}

