package jmid.learn.poo.heritage;

public class Manager extends Employe {
    private int nbEquipe;

    public Manager(String nom, double salaire, int nbEquipe) {
        super(nom, salaire);

        this.nbEquipe = nbEquipe;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre d'équipe: "+this.nbEquipe);
    }
}
