/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.alior.ci.calc.kalkulator;

/**
 *
 * @author User
 */
public class CalcEngine {

    public static int NONE = 0;
    public static int DODAWANIE = 1;
    public static int ODEJMOWANIE = 2;
    public static int WYNIK = 3;
    //
    private double lastValue;
    private boolean isLastValue = false;
    //
    private int operation = NONE;
    //
    public void setOperation(int _operation) {
        operation = _operation;
    }
    //
    public double doCalculation(double _current) {
        double _result = _current;
        if (isLastValue) {
            if (operation == DODAWANIE) {
                _result = _result + lastValue;
            }
            operation = NONE;
        }
        lastValue = lastValue = _result;
        isLastValue = true;
        //
        return _current;
    }
}
