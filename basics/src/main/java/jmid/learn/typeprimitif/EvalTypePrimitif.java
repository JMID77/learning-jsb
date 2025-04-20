package jmid.learn.typeprimitif;

import jmid.learn.Evaluation;

public class EvalTypePrimitif extends Evaluation {

    public EvalTypePrimitif() {
        setActive(false);
    }

    
    @Override
    public void execute() {
        System.out.println("\n>>>> EvalTypePrimitif");
		evalGeneral();
		evalAdapter();
    }

    public void evalGeneral() {
        System.out.println("\n>> EvalTypePrimitif.evalGeneral()");
        // Type Primitif
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b)); // 30
        System.out.println("a - b = " + (a - b)); // -10
        System.out.println("a * b = " + (a * b)); // 200
        System.out.println("a / b = " + (a / b)); // 0
        System.out.println("a % b = " + (a % b)); // 10

        // Type Primitif dengan Operator Assignment
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c += 5 : " + c); // 15

        c -= 5; // c = c - 5
        System.out.println("c -= 5 : " + c); // 10

        c *= 5; // c = c * 5
        System.out.println("c *= 5 : " + c); // 50

        c /= 5; // c = c / 5
        System.out.println("c /= 5 : " + c); // 10

        c %= 3; // c = c % 3
        System.out.println("c %= 3 : " + c); // 1
    }

    public void evalAdapter() {
        System.out.println("\n>> EvalTypePrimitif.evalAdapter()");
        int x = 10;
        int y= adapterEvalInt(x);

        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 20
    }

    private int adapterEvalInt(int a) {
        a = 20;
        return a;
    }
}