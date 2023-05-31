package customer;

import common.BaseEntity;
import common.BaseRepository;
import common.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerRepository extends BaseRepository<Customer,UUID> {
    private final List<Customer> customers = new ArrayList<>();
    private static CustomerRepository customerRepository;

    public CustomerRepository(){

    }

    private String PATH="src/main/java/WaiterFile.txt";


    public static CustomerRepository getInstance()
    {
        if( customerRepository == null )
        {
            customerRepository = new CustomerRepository();
        }
        return customerRepository;
    }

    @Override
    protected List<Customer> getList() {
        return customers ;
    }

    @Override
    protected String getFilePath() {
        return PATH;
    }

    public Customer findByID(UUID customerId) {
        for (Customer customer : getList()) {
            if(customer.getId().equals(customerId)){
                return customer;
            }
        }
        return null;
    }
}
