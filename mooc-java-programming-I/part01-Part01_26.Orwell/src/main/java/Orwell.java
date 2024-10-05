
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year: ");  // Ask the user to enter a year.
        int year = scan.nextInt();

        if (year == 1984) { 
            System.out.println("Orwell");
        }
    }
}
