package jmid.learn.collections.exo;

import java.util.HashSet;
import java.util.Set;

public class ExoIdentifiantUtilisateur {
    private Set<String> users = new HashSet<>();

    public ExoIdentifiantUtilisateur() {
        users.add("user1");
        users.add("user2");
    }

    public void executeExo() {
        System.out.println("\n>>>> ExoIdentifiantUtilisateur.executeExo()");
        System.out.println("Initial users: " + users);

        addUser("user1");
        addUser("user3");

        System.out.println("List of users:");
        for (String user : users) {
            System.out.println(user);
        }
    }

    private void addUser (String user) {
        System.out.println("Add user : "+user);
        users.add(user);
    }
}
