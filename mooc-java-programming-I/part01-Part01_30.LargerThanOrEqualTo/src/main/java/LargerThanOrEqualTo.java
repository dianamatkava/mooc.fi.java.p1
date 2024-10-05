
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = scan.nextInt();
        System.out.println("Give the second number:");
        int second = scan.nextInt();

        int res = 0;
        if (first > second) { 
            res = first;
        } else if (second > first) {
            res = second;
        } else {
            System.out.println("The numbers are equal!");
            return;
        }

        System.out.println("Greater number is: " + res);
    }
}
