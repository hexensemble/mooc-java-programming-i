
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, pages, year);
            books.add(book);

        }

        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();

        if (answer.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }

        if (answer.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }

}
