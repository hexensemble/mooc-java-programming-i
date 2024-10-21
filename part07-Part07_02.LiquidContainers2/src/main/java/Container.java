
public class Container {

    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (liquidAmount + amount > 100) {
                liquidAmount = 100;
            } else {
                liquidAmount += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (liquidAmount - amount < 0) {
                liquidAmount = 0;
            } else {
                liquidAmount -= amount;
            }
        }
    }

    public int getLiquidAmount() {
        return this.liquidAmount;
    }

    @Override
    public String toString() {
        return liquidAmount + "/100";
    }

}
