
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name:");
            String firstName = scanner.nextLine();

            if (firstName.equals("")) {
                break;
            }

            System.out.println("Last name:");
            String lastName = scanner.nextLine();

            System.out.println("Identification number:");
            String idNumber = scanner.nextLine();

            PersonalInformation person = new PersonalInformation(firstName, lastName, idNumber);

            infoCollection.add(person);
        }

        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
