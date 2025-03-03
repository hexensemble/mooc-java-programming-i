
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void remove(int number) {
        if (!tasks.isEmpty()) {
            tasks.remove(number - 1);
        }
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

}
