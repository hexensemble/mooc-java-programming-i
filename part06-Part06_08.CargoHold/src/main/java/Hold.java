
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        if (suitcases.isEmpty()) {
            return 0;
        }

        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "No Suitcases (0 kg)";
        }

        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeight() + " kg)";
        }

        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

}
