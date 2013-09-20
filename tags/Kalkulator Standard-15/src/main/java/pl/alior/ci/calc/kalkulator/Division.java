package pl.alior.ci.calc.kalkulator;

public class Division implements ICalculator {


	public int calculate(int a, int b) throws IllegalArgumentException {
		if(b == 0){
			throw new IllegalArgumentException("Nie wolno dzielic przez zero");
		}
		
		return a / b;
	}

}
