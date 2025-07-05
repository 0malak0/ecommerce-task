

public class Cheese extends Products implements Shippable,Expirable {
    private boolean isExpired;
   
    
    public Cheese(String name, double price, int quantity ,double weight, boolean isExpired) {
        super(name, price, quantity, weight);
    }
    public boolean isExpired(){
        return isExpired;
    }

    
}
