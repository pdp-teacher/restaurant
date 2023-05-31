package customer;

import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerRepository extends BaseRepository<Customer, UUID> {
    private static final String PATH = "src/main/java/customer/CustomerDatasource.txt";
    private final List<Customer> customers = new ArrayList<>();
    private static  CustomerRepository customerRepository;


    @Override
    protected String getFilePath() {
        return  PATH;
    }
    public static CustomerRepository getInstance()
    {
        if(customerRepository == null )
        {
           customerRepository = new CustomerRepository();
        }
        return customerRepository;
    }
}
