package chef;

import common.BaseRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChefRepository extends BaseRepository<Chef, UUID> implements Serializable {
    private static ChefRepository chefRepository = new ChefRepository();
    private List<Chef> chefs = new ArrayList<>();
    private ChefRepository (){

    }
    private ChefRepository(List<Chef> chefs){
        this.chefs = chefs;
    }
    @Override
    public List<Chef> getList() {
        return chefs;
    }
    public Chef save(Chef chef){
        chefs.add(chef);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("src", "chef.txt")))) {
            outputStream.writeObject(chefs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chef;
    }

    public static ChefRepository getInstance() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("src", "chef.txt")))) {
            List<Chef> chefsList = (List<Chef>) inputStream.readObject();
            chefRepository = new ChefRepository(chefsList);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return chefRepository;
    }

}
