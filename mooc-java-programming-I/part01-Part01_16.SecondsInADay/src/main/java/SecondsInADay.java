
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        String secStr = scanner.nextLine();
        int sec = Integer.parseInt(secStr);
        System.out.println(sec*60*60*24);
    }
}
