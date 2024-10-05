
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int res = 0;
        if (number < 0) {
            res = number * -1;
        } else {
            res = number;
        }
        System.out.println(res);

    }
}
