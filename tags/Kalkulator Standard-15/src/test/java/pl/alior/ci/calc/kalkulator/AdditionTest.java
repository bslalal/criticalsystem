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
public class AdditionTest {
    
    public AdditionTest() {
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
     * Test of calculate method, of class Addition.
     */
    @Test
    public void testCalculateNatural() {
        System.out.println("calculate natural");
        int a = 0;
        int b = 0;
        Addition instance = new Addition();
        int expResult = 0;
        int result = instance.calculate(a, b);
        assertEquals("natural 1", expResult, result);
        
        a = 2;
        b = 2;
        
        expResult = 4;
        result = instance.calculate(a, b);
        assertEquals("natural 2", expResult, result);
    }
    
    @Test
    public void testCalculateNegative(){
        int a = -1;
        int b = -1;
        
        Addition instance = new Addition();
        int expResult = -2;
        int result = instance.calculate(a, b);
        assertEquals("negative 1", expResult, result);
    }
    
    @Test
    public void testCalculateRandom(){
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        
        Addition instance = new Addition();
        int expResult = a + b;
        int result = instance.calculate(a, b);
        assertEquals("random", expResult, result);
    }
    
    @Test
    public void testCalculateFail(){
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        
        Addition instance = new Addition();
        int expResult = 0;
        int result = instance.calculate(a, b);
        assertEquals("random", expResult, result);
    }
    
}