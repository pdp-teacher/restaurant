package chef;

import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode( callSuper = true )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chef extends BaseEntity<UUID> implements Serializable
{
    private UUID chefId;
    private String chefName;
    private Double salary;
}
