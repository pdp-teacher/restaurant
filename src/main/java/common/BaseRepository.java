package common;

import java.util.List;
import java.util.stream.Collectors;

public  abstract class  BaseRepository<ENTITY extends BaseEntity<ID>, ID> implements Repository<ENTITY, ID>  {
public abstract List<ENTITY>getList();
    @Override
    public ENTITY save(ENTITY entity) {
        for (ENTITY entity1 : getList()) {
            if (entity1.getId().equals(entity.getId())) return null;
        }
        getList().add(entity);

        return entity;
    }

    @Override
    public ENTITY findByID(ID id) {
        for (ENTITY entity : getList()) {
            if (entity.getId().equals(id)) return entity;
        }
        return null;
    }

    @Override
    public List<ENTITY> getAll() {
        return getList();
    }

    @Override
    public void delete(ID id) {
        getList().removeIf(entity -> entity.getId().equals(id));
    }
}
