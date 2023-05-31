package ingredient;

import common.BaseRepository;

import java.util.UUID;

public class IngredientRepository extends BaseRepository<Ingredient, UUID> {
    private static IngredientRepository ingredientRepository;

    private IngredientRepository() {
    }

    public static IngredientRepository getInstance() {
        if (ingredientRepository==null){
            ingredientRepository=new IngredientRepository();
            return ingredientRepository;
        }
        return ingredientRepository;
    }

    private static final String PATH="src/main/java/ingredient/IngredientDataSource.txt";

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
