package jmid.learn.copie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Copie profonde (deep copy)
 * --------------------------------------------------
 * Si ton objet contient des références à d'autres objets et que tu veux 
 * que ces objets aussi soient copiés (et non partagés), 
 * tu dois implémenter une copie profonde. Cela implique de copier récursivement tous les objets internes de l'objet.
 */
@Getter
@Setter
@AllArgsConstructor
public class LivreDeepCopy implements Cloneable {
    private String titre;
    private Auteur auteur;

    @Override
    public LivreDeepCopy clone() {
        try {
            LivreDeepCopy livreClone = (LivreDeepCopy) super.clone();
            livreClone.auteur = new Auteur(this.auteur.getNom()); // Copie profonde de l'auteur
            return livreClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
