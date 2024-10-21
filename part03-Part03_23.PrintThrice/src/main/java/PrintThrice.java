
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String word = String.valueOf(scanner.nextLine());

        int index = 0;

        while (index < 3) {
            System.out.print(word);
            index++;
        }
    }
}
