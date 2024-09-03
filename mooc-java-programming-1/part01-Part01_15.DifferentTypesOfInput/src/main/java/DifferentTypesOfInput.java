
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        String strInt = scan.nextLine();
        int intVal = Integer.parseInt(strInt);

        System.out.println("Give a double:");
        String strDouble = scan.nextLine();
        double doubleVal = Double.parseDouble(strDouble);

        System.out.println("Give a boolean:");
        String strBool = scan.nextLine();
        boolean booleVal = Boolean.parseBoolean(strBool);

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + intVal);
        System.out.println("You gave the double " + doubleVal);
        System.out.println("You gave the boolean " + booleVal);
    }
}
