package chef;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChefRepository extends BaseRepository<Chef, UUID> {
    private final List<Chef>  chefs = new ArrayList<>();
    private static ChefRepository chefRepository = new ChefRepository();
    private ChefRepository()
    {
    }

    @Override
    protected String getFilePath() {
        return "src/main/java/chef/chef.txt";
    }

    public static ChefRepository getInstance()
    {

        return chefRepository;
    }

}
