
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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

            names.add(parts[0]);
            ages.add(Integer.valueOf(parts[1]));
        }

        String longestName = "";
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > longestName.length()) {
                longestName = names.get(i);
            }
        }

        int ageTotal = 0;
        for (int age : ages) {
            ageTotal = ageTotal + age;
        }

        double averageBirthYear = (double) ageTotal / (double) ages.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}
