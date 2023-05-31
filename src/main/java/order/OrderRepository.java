package order;

import chef.ChefRepository;
import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderRepository  extends BaseRepository<Order, UUID> {
    private static final String PATH = "src/main/java/order/OrderDatasource.txt";
    private final List<Order> orders = new ArrayList<>();
    private static OrderRepository orderRepository;


    @Override
    protected String getFilePath() {
        return  PATH;
    }
    public static OrderRepository  getInstance()
    {
        if(orderRepository == null )
        {
            orderRepository = new OrderRepository();
        }
        return orderRepository;
    }
}
