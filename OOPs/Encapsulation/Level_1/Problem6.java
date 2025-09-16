public class Problem6 {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[] {
            new VegItem("Paneer Butter Masala", 250, 2),
            new NonVegItem("Chicken Curry", 300, 1)
        };
        for (FoodItem fi : order) {
            System.out.println(fi.getItemDetails() + " Total: " + fi.calculateTotalPrice());
            if (fi instanceof Discountable) {
                System.out.println("After Discount: " + ((Discountable)fi).applyDiscount());
            }
            System.out.println("----");
        }
    }
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) { this.itemName=itemName; this.price=price; this.quantity=quantity; }
    public String getItemName(){return itemName;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    public String getItemDetails(){ return itemName+" x"+quantity+" @"+price; }
    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override
    public double calculateTotalPrice(){ return getPrice()*getQuantity(); }
    @Override
    public double applyDiscount(){ return calculateTotalPrice() * 0.1; } // 10% off
    @Override
    public String getDiscountDetails(){ return "Veg discount 10%"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name,double price,int qty){ super(name,price,qty); }
    @Override
    public double calculateTotalPrice(){ return getPrice()*getQuantity() + 50; } // extra charge
    @Override
    public double applyDiscount(){ return calculateTotalPrice() * 0.05; } // 5%
    @Override
    public String getDiscountDetails(){ return "Non-veg discount 5%"; }
}
