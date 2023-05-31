package chef;

import common.BaseRepository;
import customer.Customer;
import customer.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChefRepository extends BaseRepository<Chef, UUID> {
    private final List<Chef> chefs = new ArrayList<>();
    private static ChefRepository chefRepository;

    public ChefRepository(){

    }

    private String PATH="src/main/java/WaiterFile.txt";


    public static ChefRepository getInstance()
    {
        if( chefRepository == null )
        {
            chefRepository = new ChefRepository();
        }
        return chefRepository;
    }

    @Override
    protected List<Chef> getList() {
        return chefs ;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }
}{
}
