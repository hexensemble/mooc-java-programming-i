
import java.util.ArrayList;

public class Stack {

    ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList();
    }

    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        stack.add(value);
    }

    public String take() {
        int stackSize = stack.size() - 1;
        String last = stack.get(stackSize);
        stack.remove(stackSize);

        return last;
    }

    public ArrayList<String> values() {
        return stack;
    }

}
