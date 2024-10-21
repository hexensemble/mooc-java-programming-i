
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();

                manager.addJoke(joke);
            }

            if (command.equals("2")) {
                System.out.println("Drawing jokes:");

                System.out.println(manager.drawJoke());
            }

            if (command.equals("3")) {
                System.out.println("Printing the jokes.");

                manager.printJokes();
            }
        }
    }

}
