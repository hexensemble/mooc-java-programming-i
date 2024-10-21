
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Calculator calculator;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.calculator = new Calculator();
    }

    public void Start() {
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int points = Integer.valueOf(this.scanner.nextLine());

            if (points == -1) {
                break;
            }

            this.calculator.add(points);
        }

        System.out.println("Point average (all): " + this.calculator.average());
        System.out.println("Point average (passing): " + this.calculator.passed());
        System.out.println("Pass percentage: " + this.calculator.passPercentage());
        System.out.println("Grade distribution:\n" + this.calculator.gradeDistro());
    }

}
