
public class AdvancedAstrology {

    public static void printStars(int number) {
        int stars = 0;

        while (stars < number) {
            System.out.print("*");
            stars++;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        int spaces = 0;

        while (spaces < number) {
            System.out.print(" ");
            spaces++;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i + i - 1);
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
