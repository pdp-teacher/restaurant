package customer;

import chef.Chef;
import chef.ChefRepository;
import common.BaseRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.*;
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
   private CustomerRepository(List<Customer> customers){
       this.customers = customers;
   }

    @Override
    public Customer save(Customer customer) {
       customers.add(customer);
       try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("src", "customer.txt")))) {
           outputStream.writeObject(customers);
       } catch (IOException e) {
          e.printStackTrace();
       }
       return customer;


    }

    @Override
    public List<Customer> getList() {
        return customers;
    }

    public static CustomerRepository getInstance() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("src", "customer.txt")))) {
            List<Customer> customerList = (List<Customer>) inputStream.readObject();
            customerRepository = new CustomerRepository(customerList);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customerRepository;
    }
}
