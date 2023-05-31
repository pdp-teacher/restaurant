package customer;

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
public class Customer extends BaseEntity
{
    private UUID id;
    private String customerName;
    private String address;
    private String phone;
    private UUID waiterId;
}
