import java.util.ArrayList;

public class Recipe {

    String name, summary, instructions;
    ArrayList<Ingredient> ingredientList;

    public Recipe(String nameIn, String summaryIn, ArrayList<Ingredient> ingredientListIn, String instructionsIn) {

        name = nameIn;
        summary = summaryIn;
        ingredientList = ingredientListIn;
        instructions = instructionsIn;

    }

}