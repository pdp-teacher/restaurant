package customer;

import java.util.List;
import java.util.UUID;

public class CustomerService {
    private final CustomerRepository customerRepository=CustomerRepository.getInstance();

    public Customer save(Customer customer){
        customerRepository.save(customer);
        return customer;
    }
    public Customer getById(UUID id){
        return customerRepository.findById(id);
    }
    public List<Customer> getAll(){
        return customerRepository.getAll();
    }
    public void delete(UUID id){
        customerRepository.deleteById(id);
    }

    private static CustomerService customerService;

    private CustomerService() {
    }

    public static CustomerService getInstance() {
        if (customerService==null){
            customerService=new CustomerService();
            return customerService;
        }
        return customerService;
    }
}
