
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.ingredients = new ArrayList<>();
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

}
