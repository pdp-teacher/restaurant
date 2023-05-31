package common;

import java.util.List;

public interface Repository<ENTITY, ID> {
   ENTITY save(ENTITY entity);
   ENTITY findByID(ID id);
   List<ENTITY> getAll();
   void delete(ID id);
}
