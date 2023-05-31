package notification;

import common.BaseRepository;
import lombok.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class NotificationRepository extends BaseRepository<Notification, UUID> {
   private List<Notification> notifications = new ArrayList<>();
   private static final NotificationRepository notificationRepository = new NotificationRepository();
   private NotificationRepository(){

   }
    @Override
    public List<Notification> getList() {
        return notifications;
    }

    public static NotificationRepository getInstance() {


        return notificationRepository;
    }
}
