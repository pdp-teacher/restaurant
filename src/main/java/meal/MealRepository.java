package meal;

import common.BaseRepository;
import waiter.Waiter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MealRepository extends BaseRepository<Meal, UUID> {
    private final List<Meal> meals = new ArrayList<>();
    private static MealRepository mealRepository;

    public MealRepository()
    {

    }

    private String PATH="src/main/java/WaiterFile.txt";


    public static MealRepository getInstance()
    {
        if( mealRepository == null )
        {
            mealRepository = new MealRepository();
        }
        return mealRepository;
    }


    @Override
    protected List<Meal> getList() {
        return meals;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
