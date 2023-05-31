package order;

import common.BaseRepository;
import waiter.Waiter;
import waiter.WaiterRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderRepository extends BaseRepository<Order, UUID> {
    private static OrderRepository orderRepository = new OrderRepository();
    private List<Order> orders = new ArrayList<>();
    private OrderRepository(){

    }
    private OrderRepository(List<Order> orders){
        this.orders = orders;
    }
    @Override
    public List<Order> getList() {
        return orders;
    }

    public Order save(Order order){
        orders.add(order);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src", "order.txt")))) {

            objectOutputStream.writeObject(orders);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return order;
    }

    public static OrderRepository getInstance() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("src","order.txt")))) {
            List<Order> orderList = (List<Order>) objectInputStream.readObject();
            orderRepository = new OrderRepository(orderList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return orderRepository;
    }
}
