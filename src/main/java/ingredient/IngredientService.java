package ingredient;

import customer.Customer;
import customer.CustomerRepository;

import java.util.List;
import java.util.UUID;

public class IngredientService {
    private final IngredientRepository ingredientRepository=IngredientRepository.getInstance();

    public Ingredient save(Ingredient ingredient){
        ingredientRepository.save(ingredient);
        return ingredient;
    }
    public Ingredient getById(UUID id){
        return ingredientRepository.findById(id);
    }
    public List<Ingredient> getAll(){
        return ingredientRepository.getAll();
    }
    public void delete(UUID id){
        ingredientRepository.deleteById(id);
    }

    private static IngredientService ingredientService;

    private IngredientService() {
    }

    public static IngredientService getInstance() {
        if (ingredientService==null){
            ingredientService=new IngredientService();
            return ingredientService;
        }
        return ingredientService;
    }
}
