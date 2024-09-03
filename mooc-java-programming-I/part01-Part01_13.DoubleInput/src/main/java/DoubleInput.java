
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String num = scanner.nextLine();
        double intNum = Double.parseDouble(num);
        System.out.println("You gave the number " + intNum);

    }
}
