import notification.Notification;
import waiter.Waiter;
import waiter.WaiterRepository;

public class Main
{
    public static void main( String[] args )
    {
        WaiterRepository waiterRepository = WaiterRepository.getInstance();

        Waiter eltor = waiterRepository.save(new Waiter("Eltor", 100D, "+999"));


    }
}
