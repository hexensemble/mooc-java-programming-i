
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Type a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            list.add(number);
        }

        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }

        Double average = (double) sum / list.size();

        System.out.println("Average: " + average);
    }
}
