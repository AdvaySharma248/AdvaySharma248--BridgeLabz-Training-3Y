import java.util.*;

public class GroceryList {
    List<String> items;
    Set<String> itemSet;

    public GroceryList() {
        items = new ArrayList<>();
        itemSet = new HashSet<>();
    }

    public void addItem(String item) {
        if (item == null || item.trim().isEmpty()) return;
        item = item.trim().toLowerCase();
        if (!itemSet.contains(item)) {
            items.add(item);
            itemSet.add(item);
            System.out.println("Added: " + item);
        } else {
            System.out.println("Item already exists: " + item);
        }
    }

    public void removeItem(String item) throws ItemNotFoundException {
        if (item == null || item.trim().isEmpty()) return;
        item = item.trim().toLowerCase();
        if (items.remove(item)) {
            itemSet.remove(item);
            System.out.println("Removed: " + item);
        } else {
            throw new ItemNotFoundException("Item not found: " + item);
        }
    }

    public void displaySortedList() {
        if (items.isEmpty()) {
            System.out.println("Grocery list is empty");
            return;
        }
        List<String> sorted = new ArrayList<>(items);
        Collections.sort(sorted);
        System.out.println("Sorted Grocery List:");
        for (String i : sorted) System.out.println(i);
    }

    public String[] checkout() {
        return items.toArray(new String[0]);
    }
}
