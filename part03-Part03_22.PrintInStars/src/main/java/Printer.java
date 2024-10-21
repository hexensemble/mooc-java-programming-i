
public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;

        while (index < array.length) {
            int stars = array[index];
            int starCount = 0;

            while (starCount < stars) {
                System.out.print("*");
                starCount++;
            }

            System.out.println("");
            index++;
        }
    }

}
