package chef;

import common.BaseRepository;
import customer.Customer;
import customer.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChefRepository extends BaseRepository<Chef, UUID> {
    private static final String PATH = "src/main/java/chef/ChefDatasource.txt";
    private final List<Chef> chefs = new ArrayList<>();
    private static ChefRepository chefRepository;


    @Override
    protected String getFilePath() {
        return  PATH;
    }
    public static ChefRepository  getInstance()
    {
        if(chefRepository == null )
        {
            chefRepository = new ChefRepository();
        }
        return chefRepository;
    }
}
