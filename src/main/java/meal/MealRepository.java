package meal;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MealRepository extends BaseRepository<Meal, UUID> {
    private static MealRepository mealRepository = new MealRepository();
    List<Meal> meals = new ArrayList<>();
    private MealRepository(){
        
    }
    @Override
    public List<Meal> getList() {
        return meals;
    }

    public static MealRepository getInstance() {
        return mealRepository;
    }
}
