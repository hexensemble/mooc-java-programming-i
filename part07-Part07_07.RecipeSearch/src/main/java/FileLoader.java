
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLoader {
    
    private ArrayList<Recipe> recipes;
    
    public FileLoader() {
        this.recipes = new ArrayList<>();
    }
    
    public void loadFile(String fileName) {
        String line = "";
        int lineNumber = 1;
        Recipe recipe = new Recipe();
        
        try {
            Scanner readFile = new Scanner(Paths.get(fileName));
            
            while (readFile.hasNextLine()) {
                line = readFile.nextLine();
                
                if (lineNumber == 1) {
                    recipe = new Recipe();
                    recipe.addName(line);
                    lineNumber++;
                    continue;
                }
                
                if (lineNumber == 2) {
                    recipe.addCookingTime(Integer.valueOf(line));
                    lineNumber++;
                    continue;
                }
                
                if (line.equals("")) {
                    this.recipes.add(recipe);
                    lineNumber = 1;
                    continue;
                }
                
                recipe.addIngredients(line);
                lineNumber++;
            }
            this.recipes.add(recipe);
            
        } catch (IOException ex) {
            Logger.getLogger(RecipeSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList getRecipes() {
        return this.recipes;
    }
    
}
