package ingredient;

import common.BaseRepository;
import common.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IngredientRepository  extends BaseRepository<Ingredient, UUID> {

    private final List<Ingredient> ingredients = new ArrayList<>();
    private static IngredientRepository ingredientRepository;

    public IngredientRepository()
    {

    }

    private String PATH="src/main/java/WaiterFile.txt";


    public static IngredientRepository getInstance()
    {
        if( ingredientRepository == null )
        {
            ingredientRepository = new IngredientRepository();
        }
        return ingredientRepository;
    }

    @Override
    protected List<Ingredient> getList() {
        return null;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
