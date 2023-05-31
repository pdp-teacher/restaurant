package waiter;

import common.BaseRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



public class WaiterRepository extends BaseRepository<Waiter, UUID> {

    private String PATH="src/main/java/WaiterFile.txt";
    private final List<Waiter> waiters = new ArrayList<>();
    private static WaiterRepository waiterRepository;

    public WaiterRepository()
    {

    }


    @Override
    protected List<Waiter> getList()
    {
        return waiters;
    }

    public static WaiterRepository getInstance()
    {
        if( waiterRepository == null )
        {
            waiterRepository = new WaiterRepository();
        }
        return waiterRepository;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
