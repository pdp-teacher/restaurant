package meal;

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
public class Meal extends BaseEntity<UUID>
{
    private UUID mealId;
    private String name;
    private Double price;
    private UUID chefId;
}
