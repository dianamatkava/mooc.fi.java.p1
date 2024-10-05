
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String realPwd = "Caput Draconis";
        System.out.println("Password?");

        String userPwd = scan.nextLine();
        if (userPwd.equals(realPwd)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
