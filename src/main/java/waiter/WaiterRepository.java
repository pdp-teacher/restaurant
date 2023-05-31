package waiter;

import common.BaseRepository;

import java.util.UUID;

public class WaiterRepository extends BaseRepository<Waiter, UUID> {
    private static final String PATH="src/main/java/waiter/WaiterDataSource.txt";

    @Override
    protected String getFilePath() {
        return PATH;
    }
    private static WaiterRepository waiterRepository;

    private WaiterRepository() {
    }

    public static WaiterRepository getInstance() {
        if (waiterRepository==null){
            waiterRepository=new WaiterRepository();
            return waiterRepository;
        }
        return waiterRepository;
    }
}
