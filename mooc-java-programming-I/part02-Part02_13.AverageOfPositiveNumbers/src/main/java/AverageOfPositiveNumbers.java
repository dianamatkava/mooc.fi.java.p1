
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num > 0) {
                total++;
                sum+=num;
            }
        }
        double average = sum != 0 ? (double)sum/total : 0;
        System.out.println(average == 0 ? "Cannot calculate the average" : average);
    }
}
