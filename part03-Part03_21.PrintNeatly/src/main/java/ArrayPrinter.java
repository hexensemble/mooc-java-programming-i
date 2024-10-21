
public class ArrayPrinter {
    
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    
    public static void printNeatly(int[] array) {
        int index = 0;
        
        while (index < array.length - 1) {
            System.out.print(array[index] + ", ");
            index++;
        }
        
        System.out.print(array[index]);
    }
}
