package common;

import java.util.List;

public interface Repository <ENTITY extends BaseEntity<?>,ID>{
    ENTITY save(ENTITY entity);
    ENTITY findById(ID id);
    List<ENTITY> getAll();
    void deleteById(ID id);
}
