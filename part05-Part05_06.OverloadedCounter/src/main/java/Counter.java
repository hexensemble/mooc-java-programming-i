
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            this.value = this.value;
        } else {
            for (int i = 0; i < increaseBy; i++) {
                this.increase();
            }
        }
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            this.value = this.value;
        } else {
            for (int i = 0; i < decreaseBy; i++) {
                this.decrease();
            }
        }
    }

}
