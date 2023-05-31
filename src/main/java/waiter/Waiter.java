package waiter;

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
public class Waiter extends BaseEntity<UUID>
{
    private UUID waiterId;
    private String waiterName;
    private Double salary;
    private String phone;
}
