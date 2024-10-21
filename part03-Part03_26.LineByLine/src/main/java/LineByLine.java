
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = String.valueOf(scanner.nextLine());

        while (!input.equals("")) {
            String[] list = input.split(" ");

            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
            
            input = String.valueOf(scanner.nextLine());
        }
    }
}
