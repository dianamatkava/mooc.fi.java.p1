
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade = scan.nextInt();

        String res = "impossible!";
        if (grade < 0) {
            res = "impossible!";
        } else if (grade < 0) {
            res = "impossible!";
        } else if (grade <= 49) {
            res = "failed";
        } else if (grade <= 59) {
            res = "1";
        } else if (grade <= 69) {
            res = "2";
        } else if (grade <= 79) {
            res = "3";
        } else if (grade <= 89) {
            res = "4";
        } else if (grade <= 100) {
            res = "5";
        } else if (grade > 100) {
            res = "incredible!";
        }
        System.out.println("Grade: " +res);
    }   
}
