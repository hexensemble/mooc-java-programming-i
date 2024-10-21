
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            ages.add(Integer.valueOf(parts[1]));
        }

        int highestAge = 0;

        for (int age : ages) {
            if (age > highestAge) {
                highestAge = age;
            }
        }

        System.out.println("Age of the oldest: " + highestAge);
    }
    
}
