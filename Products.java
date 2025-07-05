public class Products {
    protected String name ;
     protected double price;
    protected int quantity;
     private double weight;
   public Products (String name, double price, int quantity,double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
         this.weight= weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

   public boolean isAvailable(int requestedQuantity) {
        return quantity >= requestedQuantity;
    }

    public void reduceQuantity(int q) {
        this.quantity -= q;
    }
    public double getWeight() {
        return weight;
    }

}