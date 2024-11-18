
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> years = new ArrayList<Integer>();

        String input = scanner.nextLine();
        while (!input.equals("")) {
            String[] words = input.split(",");

            int year = Integer.valueOf(words[words.length - 1]);
             years.add(year);
             names.add(words[0]);
            
            input = scanner.nextLine();
        }

        String longest = names.get(0);
        for (String name : names) {
            if (longest.length() < name.length()) {
                longest = name;
            }
        }

        int sum = 0;
        for (int year : years) {
            sum+=year;
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + ((double) sum/years.size()));
    }
}
