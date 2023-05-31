package common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseEntity<ID> {
    protected  ID id;
    private LocalDateTime created;
    private LocalDateTime updated;
}
