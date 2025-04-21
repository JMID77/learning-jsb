package jmid.learn.poo.heritage;

public class Employe {
    private String nom;
    private double salaire;


    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void afficherInfos() {
        System.out.println("Employé: "+this.nom);
        System.out.println("Salaire: "+String.format("%.0f", salaire)+" €.");
    }
}
