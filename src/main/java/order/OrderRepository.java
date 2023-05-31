package order;

import common.BaseEntity;
import common.BaseRepository;

import java.util.UUID;

public class OrderRepository extends BaseRepository<Order, UUID> {
    private static final String PATH="src/main/java/order/OrderDataSource.txt";

    @Override
    protected String getFilePath() {
        return PATH;
    }
    private static OrderRepository orderRepository;

    private OrderRepository() {
    }

    public static OrderRepository getInstance() {
        if (orderRepository==null){
            orderRepository=new OrderRepository();
            return orderRepository;
        }
        return orderRepository;
    }
}
