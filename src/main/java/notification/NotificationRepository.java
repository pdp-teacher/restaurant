package notification;

import common.BaseRepository;

import java.util.UUID;

public class NotificationRepository extends BaseRepository<Notification, UUID> {
    private static final String PATH="src/main/java/notification/NotificationDataSource.txt";

    @Override
    protected String getFilePath() {
        return PATH;
    }

    private static NotificationRepository notificationRepository;

    private NotificationRepository() {
    }

    public static NotificationRepository getInstance() {
        if (notificationRepository==null){
            notificationRepository=new NotificationRepository();
            return notificationRepository;
        }
        return notificationRepository;
    }
}
