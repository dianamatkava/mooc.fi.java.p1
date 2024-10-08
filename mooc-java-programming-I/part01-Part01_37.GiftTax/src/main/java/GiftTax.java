
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = scan.nextInt();

        double tax = 0.0;

        if (gift < 5000) {
            tax = 0.0;
        } else if (gift < 25000) {
            tax = (100 + (gift-5000) * 0.08);
        } else if (gift < 55000) {
            tax = (1700 + (gift-25000) * 0.1);
        } else if (gift < 200_000) {
            tax = (4700 + (gift-55000) * 0.12);
        } else if (gift < 1_000_000) {
            tax = (22100 + (gift-200_000) * 0.15);
        } else {
            tax = (142100 + (gift-1_000_000) * 0.17);
        }

        if (tax > 0) {
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
