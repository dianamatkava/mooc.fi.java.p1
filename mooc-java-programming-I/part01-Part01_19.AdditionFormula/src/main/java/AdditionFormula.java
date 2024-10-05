
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        String firstStr = scanner.nextLine();
        int first = Integer.parseInt(firstStr);
        System.out.println("Give the second number:");
        String secoundStr = scanner.nextLine();
        int secound = Integer.parseInt(secoundStr);
        System.out.println(first + " + " + secound + " = " + (first+secound));
    }
}
