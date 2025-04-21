package jmid.learn;

import java.util.ArrayList;
import java.util.List;

import jmid.learn.copie.EvalCopieObjet;
import jmid.learn.exception.EvalException;
import jmid.learn.poo.EvalPOO;
import jmid.learn.structcontrol.StructureControl;
import jmid.learn.typeobjet.EvalTypeObjet;
import jmid.learn.typeprimitif.EvalTypePrimitif;
import jmid.learn.collections.EvalCollections;
import jmid.learn.collections.exo.Exerices;


public class RunnerEvaluation {
    private List<Evaluation> evaluations = new ArrayList<>();

    public RunnerEvaluation() {
        // Ajouter les évaluations à la liste
        evaluations.add(new EvalTypePrimitif());
        evaluations.add(new EvalTypeObjet());
        evaluations.add(new EvalCopieObjet());
        evaluations.add(new StructureControl());
        evaluations.add(new EvalCollections());
        evaluations.add(new Exerices());
        evaluations.add(new EvalException());
        evaluations.add(new EvalPOO());
    } 

    public void run() {
        for (Evaluation eval : evaluations) {
            if (eval.isActive()) {
                eval.execute();
            }
        }
    }
}
