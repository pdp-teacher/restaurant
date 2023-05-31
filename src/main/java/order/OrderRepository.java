package order;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderRepository extends BaseRepository<Order, UUID> {
    private static OrderRepository orderRepository = new OrderRepository();
    private List<Order> orders = new ArrayList<>();
    private OrderRepository(){

    }
    @Override
    public List<Order> getList() {
        return orders;
    }

    public static OrderRepository getInstance() {
        return orderRepository;
    }
}
