package meal;

import common.BaseRepository;
import ingredient.Ingredient;
import ingredient.IngredientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MealRepository extends BaseRepository<Meal, UUID> {

    private static final String PATH = "src/main/java/meal/MealDatasource.txt";
    private final List<Meal> meals = new ArrayList<>();
    private static MealRepository mealRepository ;

    @Override
    protected String getFilePath() {
        return PATH;
    }
    public static MealRepository getInstance(){
        if (mealRepository == null){
            mealRepository= new MealRepository();
        }
        return mealRepository;
    }



}
