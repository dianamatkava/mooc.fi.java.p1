
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int number = scanner.nextInt();
        int min = number;
        while (number != 9999) {
            if (min > number) {
                min = number;
            }
            list.add(number);
            number = scanner.nextInt();
        }
        System.out.println("Smallest number: " + min);

        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
