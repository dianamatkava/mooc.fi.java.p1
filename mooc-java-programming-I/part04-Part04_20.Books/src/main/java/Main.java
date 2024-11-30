import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        
        while (true) {
            System.out.println("Title: "); 
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: "); 
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: "); 
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(pages, year, title);
            books.add(book);
        }

        System.out.println("What information will be printed? "); 
        String getMethod = scanner.nextLine();
        books.forEach((book) -> {
            if (getMethod.equals("everything")) {
                System.out.println(book); 
            } else {
                System.out.println(book.getTitle());
            }
        });
    }
}
