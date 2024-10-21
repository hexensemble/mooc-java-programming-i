
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(10);
        System.out.println(counter.value());
        counter.increase(5);
        System.out.println(counter.value());
        counter.decrease(10);
        System.out.println(counter.value());
    }

}
