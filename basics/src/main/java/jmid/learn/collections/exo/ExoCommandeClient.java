package jmid.learn.collections.exo;

import java.util.LinkedList;
import java.util.Queue;

public class ExoCommandeClient {
    private Queue<String> orders = new LinkedList<>();

    public ExoCommandeClient() {

    }

    public void executeExo() {
        System.out.println("\n>>>> ExoCommandeClient.executeExo()");

        addOrder("Customer C1");
        addOrder("Customer C2");

        for (String customer : orders) {
            System.out.println(customer +" is treated");
        }
    }

    private void addOrder(String customer) {
        orders.add(customer);
    }

}
