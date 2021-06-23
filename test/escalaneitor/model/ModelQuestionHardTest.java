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
public class ModelQuestionHardTest {
    
    public ModelQuestionHardTest() {
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
     * Test of getTerm1 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetTerm1() {
        System.out.println("Inicia Test getTerm1 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        double expResult = 792.0;
        instance.setTerm1(expResult);
        double result = instance.getTerm1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm1 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetTerm1() {
        System.out.println("Inicia Test setTerm1 ModelQuestionsHard");
        double term = 235.0;
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setTerm1(term);
        double result = instance.getTerm1();
        assertEquals(term, result, 0.0);
    }

    /**
     * Test of getTerm2 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetTerm2() {
        System.out.println("Inicia Test getTerm2 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        double expResult = 60.0;
        instance.setTerm2(expResult);
        double result = instance.getTerm2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm2 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetTerm2() {
        System.out.println("Inicia Test setTerm2 ModelQuestionsHard");
        double term = 832.0;
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setTerm2(term);
        double result = instance.getTerm2();
        assertEquals(term, result, 0.0);
    }

    /**
     * Test of getTerm3 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetTerm3() {
        System.out.println("Inicia Test getTerm3 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        double expResult = 207.0;
        instance.setTerm3(expResult);
        double result = instance.getTerm3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm3 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetTerm3() {
        System.out.println("Inicia Test setTerm3 ModelQuestionsHard");
        double term = 240.0;
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setTerm3(term);
        double result = instance.getTerm3();
        assertEquals(term, result, 0.0);
    }

    /**
     * Test of getTerm4 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetTerm4() {
        System.out.println("Inicia Test getTerm4 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        double expResult = 0.0;
        instance.setTerm4(expResult);
        double result = instance.getTerm4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm4 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetTerm4() {
        System.out.println("Inicia Test setTerm4 ModelQuestionsHard");
        double term4 = 9327.0;
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setTerm4(term4);
        double result = instance.getTerm4();
        assertEquals(term4, result, 0.0);
    }

    /**
     * Test of getOperator1 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetOperator1() {
        System.out.println("Inicia Test getOperator1 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        String expResult = "/";
        instance.setOperator1(expResult);
        String result = instance.getOperator1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperator1 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetOperator1() {
        System.out.println("Inicia Test setOperator1 ModelQuestionsHard");
        String operator1 = "+";
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setOperator1(operator1);
        String result = instance.getOperator1();
        assertEquals(result, operator1);
    }

    /**
     * Test of getOperator2 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetOperator2() {
        System.out.println("Inicia Test getOperator2 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        String expResult = "-";
        instance.setOperator2(expResult);
        String result = instance.getOperator2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperator2 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetOperator2() {
        System.out.println("Inicia Test setOperator2 ModelQuestionsHard");
        String operator2 = "*";
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setOperator2(operator2);
        String result = instance.getOperator2();
        assertEquals(result, operator2);
    }

    /**
     * Test of getOperator3 method, of class ModelQuestionHard.
     */
    @Test
    public void testGetOperator3() {
        System.out.println("Inicia Test getOperator3 ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        String expResult = "+";
        instance.setOperator3(expResult);
        String result = instance.getOperator3();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperator3 method, of class ModelQuestionHard.
     */
    @Test
    public void testSetOperator3() {
        System.out.println("Inicia Test setOperator3 ModelQuestionsHard");
        String operator3 = "-";
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setOperator3(operator3);
        String result = instance.getOperator3();
        assertEquals(result, operator3);
    }

    /**
     * Test of getResult method, of class ModelQuestionHard.
     */
    @Test
    public void testGetResult() {
        System.out.println("Inicia Test getResult ModelQuestionsHard");
        ModelQuestionHard instance = new ModelQuestionHard();
        double expResult = 110.0;
        instance.setResult(expResult);
        double result = instance.getResult();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setResult method, of class ModelQuestionHard.
     */
    @Test
    public void testSetResult() {
        System.out.println("Inicia Test setResult ModelQuestionsHard");
        double result_2 = 0.0;
        ModelQuestionHard instance = new ModelQuestionHard();
        instance.setResult(result_2);
        double result = instance.getResult();
        assertEquals(result, result_2, 0.0);
    }
    
}
