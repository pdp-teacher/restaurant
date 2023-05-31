package meal;

import java.util.List;
import java.util.UUID;

public class MealService {
    private static final MealRepository mealRepository=MealRepository.getInstance();

    public Meal save(Meal meal){
        return mealRepository.save(meal);
    }
    public Meal getById(UUID id){
        return mealRepository.findById(id);
    }
    public List<Meal> getAll(){return mealRepository.getAll();}

    public void delete(UUID id){
        mealRepository.deleteById(id);
    }

    private static MealService mealService;

    private MealService() {
    }

    public static MealService getInstance() {
        if (mealService==null){
            mealService=new MealService();
            return mealService;
        }
        return mealService;
    }
}
