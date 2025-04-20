package jmid.learn.typeobjet;

public class Etudiant {
    private String nom;
    private int age;

    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void changerAge(int ageLocal) {
        this.age = ageLocal;
        ageLocal = 35;

        System.out.println("Dans la méthode changerAge :");
        System.out.println("Age de l'étudiant : " + this.age);  // Affiche 30
        System.out.println("Int local : " + ageLocal);  // Affiche 35
    }
}
