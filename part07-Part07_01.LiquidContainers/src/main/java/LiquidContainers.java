
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    parts[1] = "0";
                }

                int sum = first += Integer.valueOf(parts[1]);

                if (sum > 100) {
                    first = 100;
                } else {
                    first = sum;
                }
            }

            if (parts[0].equals("move")) {
                int sum = 0;

                if (first - Integer.valueOf(parts[1]) < 0) {
                    sum = first - Integer.valueOf(parts[1]) + Integer.valueOf(parts[1]);

                    second += sum;
                    first -= sum;
                } else {
                    sum = second += Integer.valueOf(parts[1]);

                    if (sum > 100) {
                        second = 100;
                        first -= Integer.valueOf(parts[1]);
                    } else {
                        second = sum;
                        first -= Integer.valueOf(parts[1]);
                    }
                }

            }

            if (parts[0].equals("remove")) {
                if (second - Integer.valueOf(parts[1]) < 0) {
                    second = 0;
                } else {
                    second -= Integer.valueOf(parts[1]);
                }
            }

            System.out.println("");
        }
    }

}
