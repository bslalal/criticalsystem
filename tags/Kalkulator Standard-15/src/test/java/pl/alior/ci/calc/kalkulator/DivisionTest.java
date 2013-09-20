package pl.alior.ci.calc.kalkulator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class DivisionTest {
	Division division;
	
	@Before
	public void init(){
		division = new Division();
	}
	
	@Test
	public void testDivision4by2(){
		int result = division.calculate(4, 2);
		assertEquals(2, result);
	}
	
	@Test
	public void testDivision2by2(){
		int result = division.calculate(2, 2);
		assertEquals(1, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivisionBy0(){
		division.calculate(2, 0);
	}
	
	@Test
	public void testDivision2by6WithRest(){
		int result = division.calculate(2, 6);
		assertEquals(0, result);
	}
	
	
}
