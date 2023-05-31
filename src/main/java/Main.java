import customer.Customer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.UUID;

public class Main
{
    public static void main( String[] args )
    {
        Customer customer=new Customer(UUID.randomUUID(),"ergers","rdxtrh","erthrxdhj",UUID.randomUUID());

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("src/main/java/WaiterFile.txt"));
        
    }
}
