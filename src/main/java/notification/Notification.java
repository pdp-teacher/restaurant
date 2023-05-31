package notification;

import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@EqualsAndHashCode( callSuper = true )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Notification extends BaseEntity
{
    private UUID notificationId;
    private UUID customerId;
}
