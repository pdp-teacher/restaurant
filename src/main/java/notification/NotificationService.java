package notification;

import customer.Customer;
import customer.CustomerService;
import lombok.Data;

import java.security.KeyPair;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Data
public class NotificationService
{
    // Bu yerda notification repository dan olingan field bo'lishi kere; DONE
    private NotificationRepository notificationRepository=NotificationRepository.getInstance();

    private NotificationSender notificationSender = NotificationSender.getInstance();
    private CustomerService customerService=CustomerService.getInstance();

    public void sendNotification( Notification notification )
    {
        // avval notification repository ga saqlashimizi kerak.DONE
        notificationRepository.save(notification);

        // customer ni customer repository orqali id bo'yicha olish kerak. id Notificationni ichida bor.
        Customer customer=customerService.getById(notification.getCustomerId());

        Runnable runnable=()->{
            notificationSender.sendNotification( notification, customer );
            System.out.println(Thread.currentThread().getName());

        };
        new Thread(runnable).start();

    }

    public void sendNotificationInBunch( List<Notification> notifications )
    {
        ExecutorService executorService=Executors.newCachedThreadPool();

        for( Notification notification : notifications )
        {
            Runnable runnable=()->{
                sendNotification( notification );
                System.out.println(Thread.currentThread().getName());

            };
           executorService.submit(runnable);
        }
    }
    private static NotificationService notificationService;

    private NotificationService() {
    }

    public static NotificationService getInstance() {
        if (notificationService==null){
            notificationService=new NotificationService();
            return notificationService;
        }
        return notificationService;
    }
}
