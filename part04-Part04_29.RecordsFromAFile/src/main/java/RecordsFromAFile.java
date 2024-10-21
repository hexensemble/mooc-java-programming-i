
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try {
            Scanner file = new Scanner(Paths.get(fileName));

            while (file.hasNextLine()) {
                String line = file.nextLine();

                String[] parts = line.split(",");

                System.out.print(parts[0] + ", age: " + parts[1] + " ");
                if (Integer.valueOf(parts[1]) == 1) {
                    System.out.println("year");
                } else {
                    System.out.println("years");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(RecordsFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
