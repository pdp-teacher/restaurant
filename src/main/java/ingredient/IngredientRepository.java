package ingredient;

import common.BaseEntity;
import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IngredientRepository extends BaseRepository<Ingredient, UUID> {
    private static List<Ingredient> ingredients = new ArrayList<>();
    private static IngredientRepository ingredientRepository = new IngredientRepository();
    @Override
    protected String getFilePath() {
        return "src/main/java/ingredient/ingredient.txt";
    }
}
