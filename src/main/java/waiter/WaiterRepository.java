package waiter;

import common.BaseRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WaiterRepository extends BaseRepository<Waiter, UUID> {
    private static  WaiterRepository waiterRepository = new WaiterRepository() ;

    private List<Waiter> waiters = new ArrayList<>();

    private WaiterRepository() {

    }

    public WaiterRepository(List<Waiter> waiters) {
        this.waiters = waiters;
    }
    public Waiter save(Waiter waiter) {
       waiters.add(waiter);
       try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src", "waiter.txt")))) {

           objectOutputStream.writeObject(waiters);

       } catch (IOException e) {
        e.printStackTrace();
       }
       return waiter;
    }

    @Override
    public List<Waiter> getList() {
        return waiters;
    }

    public static WaiterRepository getInstance() {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("src","waiter.txt")))) {
                List<Waiter> waiters1 = (List<Waiter>) objectInputStream.readObject();
                waiterRepository = new WaiterRepository(waiters1);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        return waiterRepository;
        }
    }

