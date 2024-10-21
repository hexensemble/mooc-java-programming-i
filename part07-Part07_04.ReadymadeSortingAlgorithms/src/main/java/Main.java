
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        Main.sort(array);
        System.out.println(Arrays.toString(array));

        String[] stringArray = {"hello", "goodbye", "thanks", "no thanks"};
        System.out.println(Arrays.toString(stringArray));
        Main.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(666);
        intArray.add(69);
        intArray.add(420);
        System.out.println(intArray);
        Main.sortIntegers(intArray);
        System.out.println(intArray);

        ArrayList<String> stringArray2 = new ArrayList<>();
        stringArray2.add("Tibetan Fox");
        stringArray2.add("Cat");
        stringArray2.add("Red Panda");
        System.out.println(stringArray2);
        Main.sortStrings(stringArray2);
        System.out.println(stringArray2);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
