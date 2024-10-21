
public class Division {

    public static void main(String[] args) {
        division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        double numeratorToDouble = numerator;
        double denominatorToDouble = denominator;
        double sum = numeratorToDouble / denominatorToDouble;
        System.out.println(sum);
    }
}
