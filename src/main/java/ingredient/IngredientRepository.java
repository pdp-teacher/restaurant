package ingredient;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public class IngredientRepository extends BaseRepository<Ingredient,Integer> {
    private static IngredientRepository ingredientRepository = new IngredientRepository();
    List<Ingredient> ingredients = new ArrayList<>();
    private IngredientRepository(){

    }
    @Override
    public List<Ingredient> getList() {
        return ingredients;
    }

    public static IngredientRepository getInstance() {
        return ingredientRepository;
    }
}
