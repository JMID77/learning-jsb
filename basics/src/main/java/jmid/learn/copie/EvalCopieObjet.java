package jmid.learn.copie;

public class EvalCopieObjet {

    public void evalCopieObjetParConstructeur() {
        System.out.println("\n>> EvalCopieObjet.evalCopieObjetParConstructeur()");
        Auteur auteur = new Auteur("Jules Verne");
        LivreCopieConstructeur livre1 = new LivreCopieConstructeur("Vingt mille lieues sous les mers", auteur);
        System.out.println("Livre 1 : " + livre1.getTitre() + " - Auteur : " + livre1.getAuteur().getNom());
        LivreCopieConstructeur livre2 = new LivreCopieConstructeur(livre1); // Copie par constructeur
        System.out.println("Livre 2 : " + livre2.getTitre() + " - Auteur : " + livre2.getAuteur().getNom());
    }

    public void evalCloneObjet() {
        System.out.println("\n>> EvalCopieObjet.evalCloneObjet()");
        Auteur auteur = new Auteur("Jules Verne");
        LivreDeepCopy livre1 = new LivreDeepCopy("Vingt mille lieues sous les mers", auteur);
        System.out.println("Livre 1 : " + livre1.getTitre() + " - Auteur : " + livre1.getAuteur().getNom());
        
        LivreDeepCopy clone = livre1.clone(); // Copie par clone
        System.out.println("Livre cloné : " + clone.getTitre() + " - Auteur : " + clone.getAuteur().getNom());
        clone.setTitre("New Title");
        clone.getAuteur().setNom("New Author"); // Modification de l'auteur du clone
        System.out.println("Livre cloné et modifié : " + clone.getTitre() + " - Auteur : " + clone.getAuteur().getNom());
    }

    public void evalDeepCopy() {
        System.out.println("\n>> EvalCopieObjet.evalDeepCopy()");
        Auteur auteur = new Auteur("Jules Verne");
        LivreDeepCopy livre1 = new LivreDeepCopy("Vingt mille lieues sous les mers", auteur);
        System.out.println("Livre 1 : " + livre1.getTitre() + " - Auteur : " + livre1.getAuteur().getNom());
        
        LivreDeepCopy clone = livre1.clone(); // Copie par clone
        System.out.println("Livre cloné : " + clone.getTitre() + " - Auteur : " + clone.getAuteur().getNom());
        clone.setTitre("New Title");
        clone.getAuteur().setNom("New Author"); // Modification de l'auteur du clone
        System.out.println("Livre cloné et modifié : " + clone.getTitre() + " - Auteur : " + clone.getAuteur().getNom());
    }
        
}
