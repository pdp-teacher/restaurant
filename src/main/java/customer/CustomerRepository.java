package customer;

import common.BaseRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Data
@EqualsAndHashCode(callSuper = true)

public class CustomerRepository extends BaseRepository<Customer, UUID> {
   private static CustomerRepository customerRepository = new CustomerRepository();
   private List<Customer> customers = new ArrayList<>();
   private CustomerRepository(){

   }
    @Override
    public List<Customer> getList() {
        return customers;
    }

    public static CustomerRepository getInstance() {
        return customerRepository;
    }
}
