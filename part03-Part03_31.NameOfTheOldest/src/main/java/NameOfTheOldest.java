
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            names.add(String.valueOf(parts[0]));
            ages.add(Integer.valueOf(parts[1]));
        }

        int highestAge = 0;
        int index = 0;

        for (int i = 0; i < ages.size(); i++) {
            int age = ages.get(i);

            if (age > highestAge) {
                highestAge = age;
                index = i;
            }
        }

        System.out.println("Name of the oldest: " + names.get(index));
    }

}
