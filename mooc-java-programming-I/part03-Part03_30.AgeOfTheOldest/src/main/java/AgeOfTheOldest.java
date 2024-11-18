
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String input = scanner.nextLine();
        while (!input.equals("")) {
            String[] words = input.split(",");

            int age = Integer.valueOf(words[words.length - 1]);
            if (age > max) {
                max = age;
            }
            input = scanner.nextLine();
        }

        System.out.println("Age of the oldest: " + max);
    }
}
