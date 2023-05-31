package notification;

import customer.Customer;
import lombok.Data;

import java.security.KeyPair;
import java.util.List;

@Data
public class NotificationService
{
    // Bu yerda notification repository dan olingan field bo'lishi kere;

    private NotificationSender notificationSender = NotificationSender.getInstance();

    public void sendNotification( Notification notification )
    {
        // avval notification repository ga saqlashimizi kerak.

        // customer ni customer repository orqali id bo'yicha olish kerak. id Notificationni ichida bor.
        notificationSender.sendNotification( notification, customer );
    }

    public void sendNotificationInBunch( List<Notification> notifications )
    {
        for( Notification notification : notifications )
        {
            sendNotification( notification );
        }
    }
}
