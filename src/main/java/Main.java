import Calculators.Calculator;
import Calculators.Ints;
import Calculators.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(2)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intsCalc = new IntsCalculator(calc);
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}
