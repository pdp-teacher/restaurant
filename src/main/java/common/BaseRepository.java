package common;

import java.io.*;
import java.util.List;

public abstract class BaseRepository <ENTITY extends  BaseEntity<ID>,ID> implements Repository<ENTITY,ID>{
    protected abstract String getFilePath();
    @Override
    public ENTITY save(ENTITY entity) {
        return null;
    }

    @Override
    public ENTITY findById(ID id) {
        return null;
    }

    @Override
    public List<ENTITY> getAll() {
        return null;
    }

    @Override
    public void deleteById(ID id) {

    }
    protected List<ENTITY>readFromFile(){
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(getFilePath()))) {
            return (List<ENTITY>)stream.readObject();
        }

        catch ( IOException e) {
            throw new RuntimeException(e);
        }

        catch ( ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected void writeToFile(List<ENTITY> entities){
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(getFilePath())))
        {
            stream.writeObject(entities);
        }
        catch ( IOException e)
        {
            e.printStackTrace();
        }
    }


}
