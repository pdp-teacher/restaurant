package common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseEntity<ID> implements Serializable
{

    private ID id;
    private LocalDateTime created;
    private LocalDateTime updated;
}
