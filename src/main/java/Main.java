import customer.Customer;
import customer.CustomerService;
import notification.Notification;
import notification.NotificationService;
import waiter.Waiter;

import java.util.UUID;

public class Main
{
    private static final CustomerService customerService=CustomerService.getInstance();
    private static final NotificationService notificationService=NotificationService.getInstance();
    public static void main( String[] args )
    {
        Waiter waiter=new Waiter("Selena", 300.0,"234456788");
        waiter.setId(UUID.randomUUID());
        Customer customer=new Customer("Baxrom","Namangan","9999999999", waiter.getId());
        customer.setId(UUID.randomUUID());
        customerService.save(customer);
        for (Customer customer1 : customerService.getAll()) {
            System.out.println(customerService.getById(customer1.getId()));
        }

        Notification notification=new Notification(customer.getId());
        notification.setId(UUID.randomUUID());
        notificationService.sendNotification(notification);
    }
}
