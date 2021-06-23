/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.model;

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
public class ModelQuestionEasyTest {
    
    public ModelQuestionEasyTest() {
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
     * Test of getTerm1 method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetTerm1() {
        System.out.println("Inicia Test getTerm1 ModelQuestionsEasy");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        double expResult = 10.0;
        instance.setTerm1(expResult);
        double result = instance.getTerm1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm1 method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetTerm1() {
        System.out.println("Inicia Test setTerm1 ModelQuestionsEasy");
        double term1 = 35.0;
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setTerm1(term1);
        double result = instance.getTerm1();
        assertEquals(term1, result, 0.0);
    }

    /**
     * Test of getTerm2 method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetTerm2() {
        System.out.println("Inicia Test getTerm2 ModelQuestionsEasy");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        double expResult = 0.0;
        double result = instance.getTerm2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm2 method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetTerm2() {
        System.out.println("Inicia Test setTerm2 ModelQuestionsEasy");
        double term2 = 63.0;
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setTerm2(term2);
        double result = instance.getTerm2();
        assertEquals(result, term2, 0.0);
    }

    /**
     * Test of getOperator method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetOperator() {
        System.out.println("Inicia Test getOperator ModelQuestionsEasy");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        String expResult = "+";
        instance.setOperator(expResult);
        String result = instance.getOperator();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperator method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetOperator() {
        System.out.println("Inicia Test setOperator ModelQuestionsEasy");
        String operator = "/";
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setOperator(operator);
        String result = instance.getOperator();
        assertEquals(result, operator);
    }

    /**
     * Test of getResult method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetResult() {
        System.out.println("Inicia Test getResult ModelQuestionsEasy");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        double expResult = 226.0;
        instance.setResult(expResult);
        double result = instance.getResult();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setResult method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetResult() {
        System.out.println("Inicia Test setResult ModelQuestionsEasy");
        double result_2 = 408.0;
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setResult(result_2);
        double result = instance.getResult();
        assertEquals(result, result_2, 0.0);
    }
    
}
