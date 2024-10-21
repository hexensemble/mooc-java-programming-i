
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum = sum + number;
            amount = amount + 1;
        }

        System.out.println("Number of numbers: " + amount);
        System.out.println("Sum of the numbers: " + sum);
    }
}
