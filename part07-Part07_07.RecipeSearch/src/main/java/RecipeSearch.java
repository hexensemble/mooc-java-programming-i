
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        FileLoader fileLoader = new FileLoader();
        fileLoader.loadFile(fileName);
        ArrayList<Recipe> recipes = fileLoader.getRecipes();
        System.out.println("");

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("\n"
                        + "Recipes:");
                for (Recipe r : recipes) {
                    System.out.println(r);
                }
                System.out.println("");
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("\n"
                        + "Recipes:");
                for (Recipe r : recipes) {
                    if (r.getName().contains(word)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());

                System.out.println("\n"
                        + "Recipes:");
                for (Recipe r : recipes) {
                    if (r.getCookingTime() <= time) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String word = scanner.nextLine();

                System.out.println("\n"
                        + "Recipes:");
                for (Recipe r : recipes) {
                    if (r.getIngredients().contains(word)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }
    }

}
