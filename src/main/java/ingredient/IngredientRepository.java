package ingredient;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IngredientRepository extends BaseRepository<Ingredient, UUID> {
    private static final String PATH = "src/main/java/ingredient/IngredientDatasource.txt";
    private final List<Ingredient> ingredients = new ArrayList<>();
    private static IngredientRepository ingredientRepository;
    @Override
    protected String getFilePath() {
        return PATH;
    }
    public static  IngredientRepository getInstance()
    {
        if( ingredientRepository == null )
        {
           ingredientRepository  = new IngredientRepository();
        }
        return ingredientRepository;
    }
}
