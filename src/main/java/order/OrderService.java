package order;

import java.util.List;
import java.util.UUID;

public class OrderService {
    private static final OrderRepository orderRepository=OrderRepository.getInstance();

    public Order save(Order order){
        return orderRepository.save(order);
    }
    public Order getById(UUID id){return orderRepository.findById(id);}
    public List<Order> getAll(){return orderRepository.getAll();}
    public void delete(UUID id){orderRepository.deleteById(id);}

    private static OrderService orderService;

    private OrderService() {
    }

    public static OrderService getInstance() {
        if (orderService==null){
            orderService=new OrderService();
            return orderService;
        }
        return orderService;
    }
}
