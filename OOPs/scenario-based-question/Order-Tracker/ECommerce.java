import java.util.*;

public class ECommerce {
    List<Order> orders;

    public ECommerce() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void dailySummary() {
        double[] dailySales = new double[orders.size()];
        for (int i = 0; i < orders.size(); i++) {
            dailySales[i] = orders.get(i).getTotal();
        }
        double sum = 0;
        for (double d : dailySales) sum += d;
        System.out.println("Daily total sales: " + sum);
    }

    public void productWiseTotal(String keyword) {
        double total = 0;
        System.out.println("Orders for: " + keyword);
        for (Order o : orders) {
            if (o.productName.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(o.productName + " - " + o.quantity + " units, Total: " + o.getTotal());
                total += o.getTotal();
            }
        }
        System.out.println("Total sales for " + keyword + ": " + total);
    }
}
