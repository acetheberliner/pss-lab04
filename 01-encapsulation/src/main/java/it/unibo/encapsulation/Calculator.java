package it.unibo.encapsulation;

public class Calculator {

    private int operationsPerformed; //final previene il fatto che il metodo/parametro/classe possa essere ereditato
    private double lastResult;

    //Costruttore rimane public
    public Calculator() {
        this.operationsPerformed = 0;
        this.lastResult = 0;
    }

    private double updateStatus(final double val) {
        this.lastResult = val;
        this.operationsPerformed++;
        return this.lastResult;
    }

    public double add(final double n1, final double n2) {
        return updateStatus(n1 + n2);
    }

    public double sub(final double n1, final double n2) {
        return updateStatus(n1 - n2);
    }

    public double mul(final double n1, final double n2) {
        return updateStatus(n1 * n2);
    }

    public double div(final double n1, final double n2) {
        return updateStatus(n1 / n2);
    }   
    //--------------------------------------------------------------------------------------------------------

    public getOperationsPerformed(){
        return operationsPerformed;
    }

    public getLastResult(){
        return lastResult;
    }
    //--------------------------------------------------------------------------------------------------------

    public static void printCalculatorStatus(final Calculator calc) {
        System.out.println("operations performed: " + calc.operationsPerformed);
        System.out.println("last result" + calc.lastResult + "\n");
    }

}
