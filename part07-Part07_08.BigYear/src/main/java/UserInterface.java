
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();

            if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("All")) {
                all();
            } else if (command.equals("One")) {
                one();
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }
    }

    private void add() {
        Bird bird = new Bird();

        System.out.print("Name: ");
        bird.addName(scanner.nextLine());

        System.out.print("Name in Latin: ");
        bird.addNameLatin(scanner.nextLine());

        this.birds.add(bird);
    }

    private void observation() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();

        int index = getIndex(bird);
        if (index == -1) {
            System.out.println("Not a bird!");
        } else {
            this.birds.get(index).addObservation();
        }
    }

    private void all() {
        if (!this.birds.isEmpty()) {
            for (Bird b : this.birds) {
                System.out.println(b);
            }
        } else {
            System.out.println("No birds found!");
        }

    }

    private void one() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();

        int index = getIndex(bird);
        if (index == -1) {
            System.out.println("Bird not found!");
        } else {
            System.out.println(birds.get(index));
        }
    }

    private int getIndex(String name) {
        for (int i = 0; i < this.birds.size(); i++) {
            if (this.birds.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

}
