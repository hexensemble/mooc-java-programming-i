
public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int stars = 0;
        while (stars < number) {
            System.out.print("*");
            stars++;
        }

        System.out.println("");
    }

    public static void printSquare(int size) {
        int root = 0;
        while (root < size) {
            printStars(size);
            root++;
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
