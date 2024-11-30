
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            int num = Integer.parseInt(input);
            System.out.println((int)Math.pow(num, 3));
            input = scanner.nextLine();
        }
    }
}
