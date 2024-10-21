
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                first.add(Integer.valueOf(parts[1]));
            }

            if (parts[0].equals("move")) {
                int sum = 0;

                if (first.getLiquidAmount() - Integer.valueOf(parts[1]) < 0) {
                    sum = first.getLiquidAmount() - Integer.valueOf(parts[1]) + Integer.valueOf(parts[1]);

                    second.add(sum);
                    first.remove(sum);
                } else {
                    sum = second.getLiquidAmount() + Integer.valueOf(parts[1]);

                    second.add(sum);
                    first.remove(Integer.valueOf(parts[1]));
                }
            }

            if (parts[0].equals("remove")) {
                second.remove(Integer.valueOf(parts[1]));
            }

            System.out.println("");
        }
    }

}
