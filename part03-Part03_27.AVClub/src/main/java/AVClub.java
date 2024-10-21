
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = String.valueOf(scanner.nextLine());

        while (!input.equals("")) {
            String[] words = input.split(" ");

            for (int i = 0; i < words.length; i++) {
                if (words[i].contains("av")) {
                    System.out.println(words[i]);
                }
            }

            input = String.valueOf(scanner.nextLine());
        }
    }
}
