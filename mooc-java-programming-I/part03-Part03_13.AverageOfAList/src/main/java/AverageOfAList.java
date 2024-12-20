
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int number = scanner.nextInt();
        int sum = 0;
        while (number != -1) {
            sum += number;
            numbers.add(number);
            number = scanner.nextInt();
        }

        System.out.println("Average: " + ((double)sum/numbers.size()));
    }
}
