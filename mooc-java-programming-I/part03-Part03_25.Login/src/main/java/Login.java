
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validPwdAlex = "sunshine";
        String validNameAlex = "alex";

        String validPwdEmma = "haskell";
        String validNameEmma = "emma";


        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();

        if (name.equals(validNameAlex) && pwd.equals(validPwdAlex) || 
            name.equals(validNameEmma) && pwd.equals(validPwdEmma)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
