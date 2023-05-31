package notification;

import common.BaseRepository;
import meal.Meal;
import waiter.Waiter;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotificationRepository extends BaseRepository<Notification, UUID>
{
    private final List<Notification> notifications = new ArrayList<>();
    private static NotificationRepository notificationRepository;

    public NotificationRepository()
    {

    }


    private String PATH="src/main/java/WaiterFile.txt";

    public static NotificationRepository getInstance()
    {
        if( notificationRepository == null )
        {
            notificationRepository = new NotificationRepository();
        }
        return notificationRepository;
    }

    @Override
    protected List<Notification> getList() {
        return notifications;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }
}
