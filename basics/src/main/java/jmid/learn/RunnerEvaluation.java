package jmid.learn;

import java.util.ArrayList;
import java.util.List;

import jmid.learn.copie.EvalCopieObjet;
import jmid.learn.structcontrol.StructureControl;
import jmid.learn.typeobjet.EvalTypeObjet;
import jmid.learn.typeprimitif.EvalTypePrimitif;
import jmid.learn.collections.Collections;


public class RunnerEvaluation {
    private List<Evaluation> evaluations = new ArrayList<>();

    public RunnerEvaluation() {
        // Ajouter les évaluations à la liste
        evaluations.add(new EvalTypePrimitif());
        evaluations.add(new EvalTypeObjet());
        evaluations.add(new EvalCopieObjet());
        evaluations.add(new StructureControl());
        evaluations.add(new Collections());
    } 

    public void run() {
        for (Evaluation eval : evaluations) {
            if (eval.isActive()) {
                eval.execute();
            }
        }
    }
}
