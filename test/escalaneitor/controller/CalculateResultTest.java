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
        System.out.println("inicia test  calculateResultEasy");
        ModelQuestionEasy oper = new ModelQuestionEasy();
        oper.setTerm1(5);
        oper.setTerm2(19);
        oper.setOperator("+");
        CalculateResult instance = new CalculateResult();
        double expResult = (5+19);
        double result = instance.calculateResultEasy(oper);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateResultHalf method, of class CalculateResult.
     */
    @Test
    public void testCalculateResultHalf() {
        System.out.println("inicia test calculateResultHalf");
        ModelQuestionHalf oper = new ModelQuestionHalf();
        oper.setTerm1(6);
        oper.setTerm1(9);
        oper.setTerm1(2);
        oper.setOperator1("-");
        oper.setOperator2("+");
        CalculateResult instance = new CalculateResult();
        double expResult = (6-9+2);
        System.out.println("EXP_RESULTADO CALC HARD  -->>  "+expResult);
        double result = instance.calculateResultHalf(oper);
        System.out.println("EXP_RESULTADO CALC HARD  -->>  "+result);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateResultHard method, of class CalculateResult.
     */
    @Test
    public void testCalculateResultHard() {
        System.out.println("calculateResultHard");
        ModelQuestionHard oper = new ModelQuestionHard();
        oper.setTerm1(8);
        oper.setTerm2(5);
        oper.setTerm3(9);
        oper.setTerm4(2);
        oper.setOperator1("+");
        oper.setOperator2("+");
        oper.setOperator3("+");
        CalculateResult instance = new CalculateResult();
        double expResult = (8+5+9+2);
        //System.out.println("EXP_RESULTADO CALC HARD  -->>  "+expResult);
        double result = instance.calculateResultHard(oper);
        //System.out.println("RESULTADO CALC HARD  -->>  "+result);
        assertEquals(expResult, result, 0.0);
    }
    
}
