package notification;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotificationRepository extends BaseRepository<Notification, UUID> {
    private List<Notification> notifications = new ArrayList<>();
    private static final NotificationRepository notificationRepository = new NotificationRepository();
    @Override
    protected String getFilePath() {
        return "src/main/java/notification/notification.txt";
    }
    public static NotificationRepository getInstance(){
        return notificationRepository;
    }
}
