package waiter;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WaiterRepository extends BaseRepository<Waiter, UUID> {
    private static final String PATH = "src/main/java/chef/ChefDatasource.txt";
    private final List<Waiter> waiters = new ArrayList<>();
    private static WaiterRepository waiterRepository;


    @Override
    protected String getFilePath() {
        return  PATH;
    }
    public static WaiterRepository  getInstance()
    {
        if(waiterRepository == null )
        {
            waiterRepository = new WaiterRepository();
        }
        return waiterRepository;
    }

}
