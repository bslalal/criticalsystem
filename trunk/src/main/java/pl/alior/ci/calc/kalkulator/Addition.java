/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.alior.ci.calc.kalkulator;

/**
 *
 * @author User
 */
public class Addition implements ICalculator {

    public double calculate(double a, double b) throws IllegalArgumentException {
        return a + b;
    }
    
}
