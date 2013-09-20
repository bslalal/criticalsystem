package pl.alior.ci.calc.kalkulator;

public class Division implements ICalculator {


	public double calculate(double a, double b) throws IllegalArgumentException {
		if(b == 0){
			throw new IllegalArgumentException("Nie wolno dzielic przez zero");
		}
		//FIXME:
		return a / b;
	}

}
