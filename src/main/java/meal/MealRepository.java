package meal;

import common.BaseRepository;
import customer.Customer;
import customer.CustomerRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MealRepository extends BaseRepository<Meal, UUID> {
    private static MealRepository mealRepository = new MealRepository();
    List<Meal> meals = new ArrayList<>();
    private MealRepository(){
        
    }
    private MealRepository(List<Meal> meals){
        this.meals = meals;
    }
    @Override
    public Meal save(Meal meal) {
        meals.add(meal);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("src", "meal.txt")))) {
            outputStream.writeObject(meals);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meal;


    }
    @Override
    public List<Meal> getList() {
        return meals;
    }

    public static MealRepository getInstance() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("src", "meal.txt")))) {
            List<Meal> mealList = (List<Meal>) inputStream.readObject();
            mealRepository = new MealRepository(mealList);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mealRepository;
    }
}
