
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String name = ""; 
        String input = scanner.nextLine();
        while (!input.equals("")) {
            String[] words = input.split(",");

            int age = Integer.valueOf(words[words.length - 1]);
            if (age > max) {
                max = age;
                name = words[0];
            }
            input = scanner.nextLine();
        }

        System.out.println("Name of the oldest: " + name);
    }
}