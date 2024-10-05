
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        String firstStr = scanner.nextLine();
        int first = Integer.parseInt(firstStr);
        System.out.println("Give the second number:");
        String secondStr = scanner.nextLine();
        int second = Integer.parseInt(secondStr);
        System.out.println("Give the third number:");
        String thirdStr = scanner.nextLine();
        int third = Integer.parseInt(thirdStr);

        System.out.println("The average is " + ((double) (first + second + third) / 3));

    }
}
