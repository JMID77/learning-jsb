package jmid.learn.exception;

import jmid.learn.Evaluation;

public class EvalException extends Evaluation {
    public EvalException() {
        setActive(false);
    }

    public void execute() {
        System.out.println("\n>>>> EvalException");

        exo1_DivisionSecure();
    }

    private void exo1_DivisionSecure() {
        System.out.println("\n>> EvalTypeObjet.evalGeneral()");
        double result;

        try {
            result = diviser(4, 2);
            System.out.println("Division [4/2="+result+"]");
            result = diviser(5, 2);
            System.out.println("Division [5/2="+result+"]");
            result = diviser(5, 0);
            System.out.println("Division [5/0="+result+"]");

        } catch (Exception e) {
            System.out.println("Erreur: "+e.getMessage());
        }
    }

    private double diviser(int a, int b) throws DivisionParZeroException {
        if (b == 0) {
            throw new DivisionParZeroException("Impossible de diviser par 0.");
        } else {
            return (double) a / b;
        }
    }
}
