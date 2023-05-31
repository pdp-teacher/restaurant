package waiter;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WaiterRepository extends BaseRepository<Waiter, UUID> {
    private static final WaiterRepository waiterRepository = new WaiterRepository();
    private List<Waiter> waiters = new ArrayList<>();
    private WaiterRepository(){

    }
    @Override
    public List<Waiter> getList() {
        return waiters;
    }

    public static WaiterRepository getInstance() {
        return waiterRepository;
    }
}
