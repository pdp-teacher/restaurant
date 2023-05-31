package notification;

import customer.Customer;
import customer.CustomerRepository;
import lombok.Data;

import java.security.KeyPair;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Data
public class NotificationService
{
    // Bu yerda notification repository dan olingan field bo'lishi kere;
    private NotificationRepository notificationRepository = NotificationRepository.getInstance();
    private CustomerRepository customerRepository = CustomerRepository.getInstance();

    private NotificationSender notificationSender = NotificationSender.getInstance();
    ExecutorService executors =  Executors.newFixedThreadPool(4);

    public void sendNotification( Notification notification )
    {
        // avval notification repository ga saqlashimizi kerak.
        notificationRepository.save(notification);


        // customer ni customer repository orqali id bo'yicha olish kerak. id Notificationni ichida bor.
      //  notificationSender.sendNotification( notification,new Customer() );
        executors.execute(() -> {
            notificationSender.sendNotification(notification,customerRepository.findByID(notification.getCustomerId()));
        });


    }

    public void sendNotificationInBunch( List<Notification> notifications )
    {
        for( Notification notification : notifications )
        {
            sendNotification( notification );
        }
    }
}
