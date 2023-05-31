package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<Entity extends BaseEntity,ID> implements Repository<Entity,ID> {
    protected abstract String getFilePath();
    @Override
    public Entity save(Entity entity) {
        return null;
    }

    @Override
    public Entity findById(ID id) {
        return null;
    }

    @Override
    public List<Entity> getAll() {
        return null;
    }

    @Override
    public void deleteById(ID id) {

    }

    public List<Entity> readFromFile(){
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(getFilePath()));
            return (List<Entity>) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
