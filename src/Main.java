import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        recipeSteps.add("Milk");
        recipeSteps.add("Bread");
        recipeSteps.add("Eggs");
        recipeSteps.add("Butter");
        recipeSteps.add("Tomatoes");

        recipeSteps.set(1, "Whole Wheat Bread");

        recipeSteps.remove(recipeSteps.size() -2);
        recipeSteps.add("Cheese");
        System.out.println(recipeSteps);

    }
}