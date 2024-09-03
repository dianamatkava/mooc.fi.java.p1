
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        String num = scanner.nextLine();
        boolean intNum = Boolean.parseBoolean(num);
        System.out.println("True or false? " + intNum);

    }
}
