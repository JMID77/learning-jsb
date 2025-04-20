package jmid.learn.typeobjet;

import jmid.learn.Evaluation;

public class EvalTypeObjet extends Evaluation {
    
    public EvalTypeObjet() {
        setActive(false);
    }

     @Override
    public void execute() {
        System.out.println("\n>>>> EvalTypeObjet");
		evalAdapterEtudiant();
		evalGeneral();
		evalAdapter();
    }

    public void evalGeneral() {
        System.out.println("\n>> EvalTypeObjet.evalGeneral()");
        // Type Objet
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Length : " + rect.getLength()); // 10
        System.out.println("Width : " + rect.getWidth()); // 20

        // Modifying the object using setter methods
        rect.setLength(30);
        rect.setWidth(40);
        System.out.println("Updated Length : " + rect.getLength()); // 30
        System.out.println("Updated Width : " + rect.getWidth());   // 40
    }

    public void evalAdapter() {
        System.out.println("\n>> EvalTypeObjet.evalAdapter()");
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Updated Length : " + rect.getLength()); // 10
        System.out.println("Updated Width : " + rect.getWidth());   // 20

        Rectangle rectAdapter = adapterEvalRectangle(rect);

        System.out.println("Updated Length : " + rectAdapter.getLength()); // 40
        System.out.println("Updated Width : " + rectAdapter.getWidth());   // 50
    }

    private Rectangle adapterEvalRectangle(Rectangle rect) {
        // Calculate area using the rectangle object
        rect.setLength(40);
        rect.setWidth(50);
        return rect;
    }

    public void evalAdapterEtudiant() {
        System.out.println("\n>> EvalTypeObjet.evalAdapterEtudiant()");
        
        int ageEval = 30;

        Etudiant etudiant = new Etudiant("John", 20);
        System.out.println("Age : " + etudiant.getAge()); // 20
        etudiant.setAge(25);
        System.out.println("Age : " + etudiant.getAge()); // 25

        etudiant.changerAge(ageEval);
       // Affichage après la modification
       System.out.println("\nAprès changement dans la méthode :");
       System.out.println("Age de l'étudiant : " + etudiant.getAge());  // Affiche 30
       System.out.println("Age local : " + ageEval);  // Affiche 30
    }

}
