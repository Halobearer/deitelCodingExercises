package chapter16;

import java.util.Comparator;

public class Customer implements Comparable<Customer>, Comparator<Customer> {

    private int id;
    private String name;
    private double balance;

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public int compareTo(Customer customer) {
        if (this.getBalance() > customer.getBalance()) {
            return 1;
        } else if (customer.getBalance() > customer.getBalance())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compare(Customer first, Customer second) {
        if (first.getId() < second.getId()) {
            return 1;
        } else if (first.getId() > second.getId())
            return -1;
        return 0;
    }
}
