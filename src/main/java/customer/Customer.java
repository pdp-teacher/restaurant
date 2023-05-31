package customer;

import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode( callSuper = true )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer extends BaseEntity<UUID> implements Serializable
{

    private String customerName;
    private String address;
    private String phone;
    private UUID waiterId;
}
