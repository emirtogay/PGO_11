import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "I1"));
        items.add(new Item(2, "I2"));
        items.add(new Item(3, "I3"));
        items.add(new Item(4, "I4"));
        items.add(new Item(5, "I5"));
        items.add(new Item(6, "I6"));
        items.add(new Item(7, "I7"));
        items.add(new Item(8, "I8"));
        items.add(new Item(9, "I9"));
        items.add(new Item(10, "I10"));

        List<Item> subList = items.subList(0, 5);

        HashSet<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}
