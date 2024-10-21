
import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passed;

    public Calculator() {
        this.points = new ArrayList<>();
        this.passed = new ArrayList<>();
    }

    public void add(int pointsToAdd) {
        if (pointsToAdd >= 0 && pointsToAdd <= 100) {
            this.points.add(pointsToAdd);
        }

    }

    public double average() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }

        double average = (double) sum / this.points.size();

        return average;
    }

    public double passed() {
        for (int point : this.points) {
            if (point >= 50) {
                this.passed.add(point);
            }
        }

        int sum = 0;
        for (int point : this.passed) {
            sum += point;
        }

        double average = (double) sum / this.passed.size();

        return average;
    }

    public double passPercentage() {
        double sum = (double) 100 * this.passed.size() / this.points.size();
        return sum;
    }

    public String gradeDistro() {
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        String stars0 = "";
        String stars1 = "";
        String stars2 = "";
        String stars3 = "";
        String stars4 = "";
        String stars5 = "";

        for (int point : this.points) {
            if (point >= 0 && point < 50) {
                grade0 += 1;
            }
            if (point >= 50 && point < 60) {
                grade1 += 1;
            }
            if (point >= 60 && point < 70) {
                grade2 += 1;
            }
            if (point >= 70 && point < 80) {
                grade3 += 1;
            }
            if (point >= 80 && point < 90) {
                grade4 += 1;
            }
            if (point >= 90 && point <= 100) {
                grade5 += 1;
            }
        }

        for (int i = 0; i < grade0; i++) {
            stars0 += "*";
        }
        for (int i = 0; i < grade1; i++) {
            stars1 += "*";
        }
        for (int i = 0; i < grade2; i++) {
            stars2 += "*";
        }
        for (int i = 0; i < grade3; i++) {
            stars3 += "*";
        }
        for (int i = 0; i < grade4; i++) {
            stars4 += "*";
        }
        for (int i = 0; i < grade5; i++) {
            stars5 += "*";
        }

        return "5: " + stars5 + "\n"
                + "4: " + stars4 + "\n"
                + "3: " + stars3 + "\n"
                + "2: " + stars2 + "\n"
                + "1: " + stars1 + "\n"
                + "0: " + stars0;
    }

}
