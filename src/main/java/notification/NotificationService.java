package notification;

import customer.Customer;
import customer.CustomerRepository;
import lombok.Data;

import java.security.KeyPair;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class NotificationService
{
    // Bu yerda notification repository dan olingan field bo'lishi kere;
    private final NotificationRepository notificationRepository =NotificationRepository.getInstance();

    private final CustomerRepository customerRepository  = CustomerRepository.getInstance();
    private NotificationSender notificationSender = NotificationSender.getInstance();

    public void sendNotification( Notification notification )

    {
        notification.setNotificationId(UUID.randomUUID());
        notification.setCreated(LocalDateTime.now());
        notification.setUpdated(LocalDateTime.now());
        notificationRepository.save(notification);
        // avval notification repository ga saqlashimizi kerak.

        // customer ni customer repository orqali id bo'yicha olish kerak. id Notificationni ichida bor.

        //notificationSender.sendNotification( notification, customer );
    }

    public void sendNotificationInBunch( List<Notification> notifications )
    {
        for( Notification notification : notifications )
        {
            sendNotification( notification );
        }
    }
}
