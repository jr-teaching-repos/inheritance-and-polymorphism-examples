import ingredient.Ingredient;
import jelly.Jelly;

public class IngredientTest {

    public static void main(String[] args) {

        Ingredient ing1 = new Ingredient(true, false);
        throwAwayIngredient(ing1);

        Ingredient ing2 = new Jelly(true, false, "Smucker's", "Grape");
        throwAwayIngredient(ing2);

        Ingredient ing3 = new PeanutButter(false, true, true, true);
        throwAwayIngredient(ing3);

        Ingredient ing4 = new Bread(false, false, true, 10);
        throwAwayIngredient(ing4);

    }

    public static void throwAwayIngredient(Ingredient ingredient) {
        ingredient.throwAway();
    }

}
