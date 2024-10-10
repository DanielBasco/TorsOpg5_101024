package opg1;

import java.util.ArrayList;


public class CustomerMain {


    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList();

        customers.add(new Customer("Daniel", "Jacobsen", "ProblemDaniel"));
        customers.add(new Customer("Bo", "Larsen", "Krabsemand"));
        customers.add(new Customer("Jesper", "Pilgaard", "Jepperdrengen"));

        printCustomers(customers);
    }

        static void printCustomers(ArrayList<Customer> customers ){
            for (Customer c : customers ){
                System.out.println(c);
            }
        }

    }

