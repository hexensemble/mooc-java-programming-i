
public class Statistics {

    private int sum;
    private int count;

    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
    }

    public double average() {
        if (sum == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }

    public int sum() {
        return this.sum;
    }

    public int getCount() {
        return this.count;
    }

}
