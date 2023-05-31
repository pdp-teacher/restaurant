package common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<Entity extends BaseEntity<ID>,ID> implements Repository<Entity,ID> {
    protected abstract String getFilePath();
    @Override
    public Entity save(Entity entity) {
        if (entity.getId()==null){
            System.out.println("Enter entity's id");
            return null;
        }
        List<Entity> list=readFromFile();
        for (Entity entity1 : list) {
            if (entity1.getId().equals(entity.getId()))return null;
        }
        list.add(entity);
        writeToFile(list);
        return entity;
    }

    @Override
    public Entity findById(ID id) {
        List<Entity> list=readFromFile();
        for (Entity entity : list) {
            if (entity.getId().equals(id))return entity;
        }
        return null;
    }

    @Override
    public List<Entity> getAll() {
        return readFromFile();
    }

    @Override
    public void deleteById(ID id) {
        List<Entity> list=readFromFile();
        for (Entity entity : list) {
            if (entity.getId().equals(id)){
                list.remove(entity);
                writeToFile(list);
                break;
            }
        }
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
    public void writeToFile(List<Entity> entityList){
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(getFilePath()));
            objectOutputStream.writeObject(entityList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
