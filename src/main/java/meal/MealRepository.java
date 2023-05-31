package meal;

import common.BaseRepository;

import java.util.UUID;

public class MealRepository extends BaseRepository<Meal, UUID> {
    private MealRepository() {
    }
    private static MealRepository mealRepository;

    public static MealRepository getInstance() {
        if (mealRepository==null){
            mealRepository=new MealRepository();
            return mealRepository;
        }
        return mealRepository;
    }

    private static final String PATH="src/main/java/meal/MealDataSource.txt";

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
