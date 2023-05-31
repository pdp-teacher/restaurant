package order;

import common.BaseRepository;
import waiter.Waiter;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderRepository extends BaseRepository<Order, UUID> {

    private final List<Order> orders = new ArrayList<>();
    private static OrderRepository orderRepository;

    public OrderRepository()
    {

    }
    private String PATH="src/main/java/WaiterFile.txt";

    public static OrderRepository getInstance()
    {
        if( orderRepository == null )
        {
            orderRepository = new OrderRepository();
        }
        return orderRepository;
    }

    @Override
    protected List<Order> getList() {
        return orders;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
