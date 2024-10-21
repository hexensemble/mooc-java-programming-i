
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int add = first + second;
        int subtract = first - second;
        int times = first * second;
        double divide = (first * 1.0) / second;

        System.out.println(first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + subtract);
        System.out.println(first + " * " + second + " = " + times);
        System.out.println(first + " / " + second + " = " + divide);
    }

}
