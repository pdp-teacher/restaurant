package notification;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotificationRepository  extends BaseRepository<Notification, UUID> {
    private static final String PATH = "src/main/java/notification/NotificationDatasource.txt";
    private final List<Notification> chefs = new ArrayList<>();
    private static NotificationRepository notificationRepository;


    @Override
    protected String getFilePath() {
        return  PATH;
    }
    public static NotificationRepository  getInstance()
    {
        if(notificationRepository == null )
        {
            notificationRepository = new NotificationRepository();
        }
        return notificationRepository;
    }
}
