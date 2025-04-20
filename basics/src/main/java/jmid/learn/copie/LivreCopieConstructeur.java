package jmid.learn.copie;


/**
 * Copie manuelle via un constructeur de copie ou méthode de copie
 * --------------------------------------------------------------------
 * Tu peux créer un constructeur de copie ou une méthode pour créer un nouvel objet 
 * qui copie les valeurs des attributs de l’objet original.
 */
public class LivreCopieConstructeur {
    private String titre;
    private Auteur auteur;

    public LivreCopieConstructeur(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    /**
     * Dans cet exemple, p2 est une copie de p1 grâce au constructeur de copie. 
     * p2 et p1 sont deux objets différents, donc les modifications de p2 n'affectent pas p1.
     */
    public LivreCopieConstructeur(LivreCopieConstructeur livre) {
        this.titre = livre.getTitre();
        this.auteur = new Auteur(livre.getAuteur().getNom());
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

}
