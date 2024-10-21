
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter number (9999 to stop):");
            int inputtedNumber = Integer.valueOf(scanner.nextLine());

            if (inputtedNumber == 9999) {
                break;
            }

            list.add(inputtedNumber);
        }

        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);

            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);

        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
