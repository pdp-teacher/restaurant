package common;

import java.util.List;

public interface Repository<Entity extends BaseEntity<ID>,ID> {
    Entity save(Entity entity);
    Entity findById(ID id);
    List<Entity> getAll();
    void deleteById(ID id);
}
