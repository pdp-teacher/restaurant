package notification;

import customer.Customer;

import java.util.Random;

public class NotificationSender
{
    private static NotificationSender notificationSender;

    private NotificationSender()
    {
    }

    public void sendNotification( Notification notification, Customer customer )
    {

        if( customer == null || customer.getPhone() == null || notification == null )
        {
            return;
        }

        try
        {
            Random random = new Random();
            Thread.sleep( random.nextInt( 1000 ) );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        }
        System.out.println( "Sms customer " + customer.getId() + " ge yuborildi" );
    }

    public static NotificationSender getInstance()
    {
        if( notificationSender == null )
        {
            notificationSender = new NotificationSender();
        }
        return notificationSender;
    }

}
