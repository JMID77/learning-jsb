package jmid.learn.copie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Utilisation de la méthode clone()
 * --------------------------------------------------
 * Java permet de créer une copie superficielle d’un objet via la méthode clone(), 
 * qui est une méthode définie dans la classe Object. Cependant, pour l’utiliser, 
 * il faut que ta classe implémente l'interface Cloneable. 
 * Cela ne crée qu'une copie superficielle, c’est-à-dire que les objets référencés 
 * à l’intérieur de l'objet ne sont pas copiés (ils restent partagés).
 */
@Getter
@Setter
@AllArgsConstructor
public class LivreClone implements Cloneable {
    private String titre;
    private Auteur auteur;

    /**
     * La méthode clone() crée une copie superficielle de l'objet. 
     * Cela signifie que les valeurs primitives sont copiées, 
     * mais les objets référencés à l'intérieur restent partagés entre l'objet original et sa copie.
     */
    @Override
    public LivreClone clone() {
        try {
            return (LivreClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
