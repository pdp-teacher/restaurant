package meal;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MealRepository extends BaseRepository<Meal, UUID> {

    @Override
    protected String getFilePath() {
        return "src/main/java/meal/meal.txt";
    }
}
