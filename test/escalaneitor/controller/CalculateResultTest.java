/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.controller;

import escalaneitor.model.ModelQuestionEasy;
import escalaneitor.model.ModelQuestionHalf;
import escalaneitor.model.ModelQuestionHard;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaicom025
 */
public class CalculateResultTest {
    
    public CalculateResultTest() {
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
     * Test of calculateResultEasy method, of class CalculateResult.
     */
    @Test
    public void testCalculateResultEasy() {
        System.out.println("calculateResultEasy");
        ModelQuestionEasy oper = null;
        CalculateResult instance = new CalculateResult();
        double expResult = 0.0;
        double result = instance.calculateResultEasy(oper);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateResultHalf method, of class CalculateResult.
     */
    @Test
    public void testCalculateResultHalf() {
        System.out.println("calculateResultHalf");
        ModelQuestionHalf oper = null;
        CalculateResult instance = new CalculateResult();
        double expResult = 0.0;
        double result = instance.calculateResultHalf(oper);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateResultHard method, of class CalculateResult.
     */
    @Test
    public void testCalculateResultHard() {
        System.out.println("calculateResultHard");
        ModelQuestionHard oper = null;
        CalculateResult instance = new CalculateResult();
        double expResult = 0.0;
        double result = instance.calculateResultHard(oper);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
