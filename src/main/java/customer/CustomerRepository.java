package customer;

import common.BaseRepository;

import java.util.UUID;

public class CustomerRepository extends BaseRepository<Customer, UUID> {
    private static CustomerRepository customerRepository;
    private CustomerRepository() {
    }

    public static CustomerRepository getInstance() {
        if (customerRepository==null){
            customerRepository=new CustomerRepository();
            return customerRepository;
        }
        return customerRepository;
    }
    private static final String PATH="src/main/java/customer/CustomerDataSource.txt";
    @Override
    protected String getFilePath() {
        return PATH;
    }
}
