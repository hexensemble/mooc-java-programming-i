
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");

        try {
            Scanner file = new Scanner(Paths.get(scanner.nextLine()));

            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
