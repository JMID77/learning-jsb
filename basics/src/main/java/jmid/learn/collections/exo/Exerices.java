package jmid.learn.collections.exo;

import jmid.learn.Evaluation;

public class Exerices extends Evaluation {

    public Exerices() {
        setActive(false);
    }

    @Override
    public void execute() {
        System.out.println("\n>>>> Excerices");
        
        evalExo1_GestionStockMap();
        evalExo2_GestionIdentifiantUtilisateur();
        evalExo3_GestionCommandeClient();
    }

    private void evalExo1_GestionStockMap() {
        System.out.println("\n>>>> Excerices.evalExo1_GestionStockMap()");

        ExoStock stock = new ExoStock();
        stock.executeExo();
    }

    private void evalExo2_GestionIdentifiantUtilisateur() {
        System.out.println("\n>>>> Excerices.evalExo2_GestionIdentifiantUtilisateur()");

        ExoIdentifiantUtilisateur user = new ExoIdentifiantUtilisateur();
        user.executeExo();
    }

    private void evalExo3_GestionCommandeClient() {
        System.out.println("\n>>>> Excerices.evalExo3_GestionCommandeClient()");

        ExoCommandeClient order = new ExoCommandeClient();
        order.executeExo();
    }
}
