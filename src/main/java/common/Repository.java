package common;

import java.util.List;
import java.util.UUID;

public interface Repository <ENTITY extends BaseEntity<UUID>,ID>{
     ENTITY save(ENTITY entity);
     void delete(ID id);
     List<ENTITY> getAll();

}
