
import java.util.ArrayList;
import java.util.Iterator;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        boolean exists = false;

        for (String addedMeal : meals) {
            if (addedMeal.contains(meal)) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String addedMeal : meals) {
            System.out.println(addedMeal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
