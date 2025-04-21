package jmid.learn.poo.encapsulation;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double montantInitial) {
        this.solde = montantInitial;
    }

    public double getSolde() {return this.solde;}

    public void deposer(double montant) {
        if (montant >= 0) {
            this.solde += montant;
            System.out.println("Nouveau solde disponible > "+this.solde);
        } else {
            System.out.println("Montant du dépôt doit être positif !");
        }
    }

    public void retirer(double montant) {
        if (montant < 0) {
            System.out.println("Montant du retrait doit être positif !");
        } else if ((this.solde - montant) < 0) {
            System.out.println("Solde insuffisant pour le retrait");
        } else {
            this.solde -= montant;
            System.out.println("Nouveau solde disponible > "+this.solde);
        }
    }
}
