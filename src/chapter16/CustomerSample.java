package chapter16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSample {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Zainab", 3_000_000_000.00);
        Customer customer1 = new Customer(2, "Professor", 300_000.00);
        Customer customer2 = new Customer(3, "Femi", -300_000.00);

//
//        Comparator<Customer> comparator = (c1, c2) -> {
//            if (c1.getId() > c2.getId()) {
//                return 1;
//            } else if (c2.getId() > c1.getId()) {
//                return -1;
//            }
//            return 0;
//        };


        Set<Customer> customers = new TreeSet<>(Comparator.reverseOrder());
        customers.add(customer1);
        customers.add(customer);
        customers.add(customer2);


        System.out.println(customers);
    }
}
