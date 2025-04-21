package jmid.learn.poo;

import java.util.List;

import jmid.learn.Evaluation;
import jmid.learn.poo.encapsulation.CompteBancaire;
import jmid.learn.poo.heritage.*;
import jmid.learn.poo.polymorphisme.abstr.*;
import jmid.learn.poo.polymorphisme.interf.*;

public class EvalPOO extends Evaluation {
    public EvalPOO() {
        setActive(true);
    }

    public void execute() {
        System.out.println("\n>>>> EvalPOO");

        evalEncapsulation();

        evalHeritage();

        evalPolymorphismeAbstract();
        evalPolymorphismeInterface();
    }
    
    private void evalEncapsulation() {
        System.out.println("\n>> EvalPOO.evalEncapsulation()");

        CompteBancaire cb = new CompteBancaire(100);

        System.out.println("Solde initial >> "+cb.getSolde());

        cb.deposer(50);
        cb.deposer(-20);
        cb.retirer(-20);
        cb.retirer(75);
        cb.retirer(500);

        System.out.println("Solde final >> "+cb.getSolde());
    }

    private void evalHeritage() {
        System.out.println("\n>> EvalPOO.evalHeritage()");

        Employe employe = new Manager("Manager1", 100, 2);

        employe.afficherInfos();
    }


    private void evalPolymorphismeAbstract() {
        System.out.println("\n>> EvalPOO.evalPolymorphismeAbstract()");

        List<Animal> animals = List.of(new Chat(), new Oiseau(), new Chien(), new Oiseau(), new Chien(), new Chat());

        for (Animal animal : animals) {
            animal.parler();
        }
    }

    
    private void evalPolymorphismeInterface() {
        System.out.println("\n>> EvalPOO.evalPolymorphismeInterface()");

        List<Vehicule> vehicules = List.of(new Voiture(), new Moto(), new Velo());

        for (Vehicule vehicule : vehicules) {
            vehicule.rouler();
        }
    }
}
