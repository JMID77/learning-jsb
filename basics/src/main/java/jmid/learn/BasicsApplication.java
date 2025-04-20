package jmid.learn;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jmid.learn.collections.Collections;
import jmid.learn.copie.EvalCopieObjet;
import jmid.learn.structcontrol.StructureControl;
import jmid.learn.typeobjet.EvalTypeObjet;
import jmid.learn.typeprimitif.EvalTypePrimitif;

@SpringBootApplication
public class BasicsApplication {
    public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);

		// Instancier et appeler les méthodes de Collections
		evalCollections();

		// Instancier et appeler les méthodes de StructureControl
		//evalStructureControl();


		// Instancier et appeler les méthodes de EvalCopieObjet
		//evalCopieObjet();

		
		// Instancier et appeler les méthodes de EvalTypeObjet
		//evalTypeObjet();


		// Instancier et appeler les méthodes de EvalTypePrimitif
		//evalPrimitif();
	}


	private static void evalPrimitif() {
		System.out.println("\n>>>> EvalTypePrimitif");
		EvalTypePrimitif evalPrimitif = new EvalTypePrimitif();
		evalPrimitif.evalGeneral();
		evalPrimitif.evalAdapter();
	}

	private static void evalTypeObjet() {
		System.out.println("\n>>>> EvalTypeObjet");
		EvalTypeObjet evalObjet = new EvalTypeObjet();
		evalObjet.evalAdapterEtudiant();
		evalObjet.evalGeneral();
		evalObjet.evalAdapter();
	}

	private static void evalCopieObjet() {
		System.out.println("\n>>>> EvalCopieObjet");
		EvalCopieObjet evalCopieObjet = new EvalCopieObjet();
		evalCopieObjet.evalCopieObjetParConstructeur();
		evalCopieObjet.evalCloneObjet();
		evalCopieObjet.evalDeepCopy();
	}

	private static void evalStructureControl() {
		System.out.println("\n>>>> StructureControl");
		StructureControl structureControl = new StructureControl();

		structureControl.evalForLoop();
		structureControl.evalDoWhileLoop();
	}

	private static void evalCollections() {
		System.out.println("\n>>>> Collections");
		Collections coll = new Collections();

		coll.evalMapProductWithPrice();
	}
}