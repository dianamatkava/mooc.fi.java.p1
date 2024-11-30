
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        while (!name.isEmpty()) {
            Item item = new Item(name);
            items.add(item);
            name = scanner.nextLine();
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
