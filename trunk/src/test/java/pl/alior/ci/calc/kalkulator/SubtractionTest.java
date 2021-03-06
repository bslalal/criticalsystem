/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.alior.ci.calc.kalkulator;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class SubtractionTest {
    
    public SubtractionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class Subtraction.
     */   
    @Test
    public void testCalculateNatural() {
        System.out.println("calculate natural");
        double a = 0;
        double b = 0;
        Subtraction instance = new Subtraction();
        double expResult = 0;
        double result = instance.calculate(a, b);
        assertEquals("natural 1", expResult, result,0.1);
        
        a = 2;
        b = 2;
        
        expResult = 0;
        result = instance.calculate(a, b);
        assertEquals("natural 2", expResult, result,0.1);
    }
    
    @Test
    public void testCalculateNegative(){
        double a = -1;
        double b = -1;
        
        Subtraction instance = new Subtraction();
        double expResult = 0;
        double result = instance.calculate(a, b);
        assertEquals("negative 1", expResult, result,0.1);
    }
    
    @Test
    public void testCalculateRandom(){
        double a = new Random().nextInt();
        double b = new Random().nextInt();
        
        Subtraction instance = new Subtraction();
        double expResult = a - b;
        double result = instance.calculate(a, b);
        assertEquals("random", expResult, result,0.1);
    }
    
}