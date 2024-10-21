
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        boolean fileOk = false;
        boolean nameFound = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try {
            Scanner scanFile = new Scanner(Paths.get(file));

            while (scanFile.hasNextLine()) {
                names.add(scanFile.nextLine());
            }

            fileOk = true;
        } catch (IOException ex) {
            System.out.println("Reading the file " + searchedFor + " failed.");
        }

        if (fileOk) {
            for (String name : names) {
                if (name.equals(searchedFor)) {
                    nameFound = true;
                    System.out.println("Found!");
                }
            }

            if (!nameFound) {
                System.out.println("Not found.");
            }
        }
    }
}
