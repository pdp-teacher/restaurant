package ingredient;

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
public class Ingredient extends BaseEntity<UUID> implements Serializable
{
    private Integer ingredientId;
    private String ingredientName;
    private String description;
    private UUID mealId;
}
