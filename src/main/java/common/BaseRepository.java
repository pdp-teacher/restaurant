package common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import waiter.Waiter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public abstract class BaseRepository <ENTITY extends BaseEntity<UUID>,ID> implements Repository <ENTITY, ID>{

    protected abstract List<ENTITY> getList();

    protected abstract String getFilePath();

    @Override
    public ENTITY save(ENTITY entity) {

        List<ENTITY> entities = readFromFile();
        entities.add(entity);
        writeToFile(entities);

        return entity;
    }

    @Override
    public void delete(ID id) {
        for (ENTITY read : readFromFile()) {
            if (read.getId().equals(id)){
                readFromFile().remove(read);
            }
        }
    }

    @Override
    public List<ENTITY> getAll() {
        return readFromFile();
    }


    public List<ENTITY> readFromFile(){

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(getFilePath()))){

            objectInputStream.readObject();
            return (List<ENTITY>) objectInputStream;

        }catch(Exception e){
            e.printStackTrace();
        }

        return new ArrayList<>();
    }


    public void  writeToFile(List<ENTITY> entity){

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(getFilePath()))){
            objectOutputStream.writeObject(entity);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}








