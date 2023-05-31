package customer;

import chef.Chef;
import chef.ChefRepository;
import common.BaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerRepository extends BaseRepository<Customer, UUID> {

    private   static List<Customer> customers = new ArrayList<>();
    private static CustomerRepository customerRepository = new CustomerRepository();
    private CustomerRepository()
    {
    }

    @Override
    protected String getFilePath() {
        return "src/main/java/customer/customer.txt";
    }


    public static CustomerRepository getInstance()
    {

        return customerRepository;
    }


}
