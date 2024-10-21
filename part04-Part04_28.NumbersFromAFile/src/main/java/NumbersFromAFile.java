
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try {
            Scanner loadFile = new Scanner(Paths.get(file));

            while (loadFile.hasNextLine()) {
                String line = loadFile.nextLine();

                if (Integer.valueOf(line) >= lowerBound && Integer.valueOf(line) <= upperBound) {
                    numbers.add(Integer.valueOf(line));
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(NumbersFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Numbers: " + numbers.size());
    }

}
