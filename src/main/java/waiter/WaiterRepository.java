package waiter;

import common.BaseRepository;

import java.util.UUID;

public class WaiterRepository extends BaseRepository<Waiter, UUID> {

    @Override
    protected String getFilePath() {
        return "src/main/java/waiter/waiter.txt";
    }
}
