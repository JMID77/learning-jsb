package jmid.learn.structcontrol;

import java.util.Scanner;

import jmid.learn.Evaluation;

public class StructureControl extends Evaluation {
    public StructureControl() {
        setActive(false);
    }

    @Override
    public void execute() {
        System.out.println("\n>>>> StructureControl");
		evalForLoop();
		evalDoWhileLoop();
    }


    public void evalForLoop() {
       System.out.println(">>>> StructureControl.evalForLoop()");
       for (int i = 1; i <= 20 ; i++) {
            if (i % 2 == 0) {
                System.out.println("Nombre paire = " + i);
            }
       }
    }

    public void evalDoWhileLoop() {
        System.out.println(">>>> StructureControl.evalDoWhileLoop()");
        Scanner scanner = new Scanner(System.in);
        int choix;
        
        do {
            System.out.println("\nMenu :");
            System.out.println("1 - Afficher les nombres de 1 à 10");
            System.out.println("2 - Afficher les nombres pairs entre 1 et 20");
            System.out.println("3 - Quitter");
            System.out.print("Entrez votre choix : ");

            choix = scanner.nextInt();
            
            switch (choix) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 20; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }   

        } while (choix != 3);

        scanner.close();
    }
}
