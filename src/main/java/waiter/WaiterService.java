package waiter;

import java.util.List;
import java.util.UUID;

public class WaiterService {
    private static final WaiterRepository waiterRepository=WaiterRepository.getInstance();

    public Waiter save(Waiter waiter){
        return waiterRepository.save(waiter);
    }
    public Waiter getById(UUID id){return waiterRepository.findById(id);}
    public List<Waiter> getAll(){return waiterRepository.getAll();}

    public void delete(UUID id){waiterRepository.deleteById(id);}

    private static WaiterService waiterService;

    private WaiterService() {
    }

    public static WaiterService getInstance() {
        if (waiterService==null){
            waiterService=new WaiterService();
            return waiterService;
        }
        return waiterService;
    }
}
