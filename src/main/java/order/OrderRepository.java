package order;

import common.BaseRepository;

import java.util.UUID;

public class OrderRepository extends BaseRepository<Order, UUID> {

    @Override
    protected String getFilePath() {
        return "src/main/java/order/order.txt";
    }
}
