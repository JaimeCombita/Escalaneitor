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
public class ModelQuestionHalfTest {
    
    public ModelQuestionHalfTest() {
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
     * Test of getTerm1 method, of class ModelQuestionHalf.
     */
    @Test
    public void testGetTerm1() {
        System.out.println("Inicia Test getTerm1 ModelQuestionsHalf");
        ModelQuestionHalf instance = new ModelQuestionHalf();
        double expResult = 785.0;
        instance.setTerm1(expResult);
        double result = instance.getTerm1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm1 method, of class ModelQuestionHalf.
     */
    @Test
    public void testSetTerm1() {
        System.out.println("Inicia Test setTerm1 ModelQuestionsHalf");
        double term1 = 10.0;
        ModelQuestionHalf instance = new ModelQuestionHalf();
        instance.setTerm1(term1);
        double result = instance.getTerm1();
        assertEquals(term1, result, 0.0);
    }

    /**
     * Test of getTerm2 method, of class ModelQuestionHalf.
     */
    @Test
    public void testGetTerm2() {
        System.out.println("Inicia Test getTerm2 ModelQuestionsHalf");
        ModelQuestionHalf instance = new ModelQuestionHalf();
        double expResult = 427.0;
        instance.setTerm2(expResult);
        double result = instance.getTerm2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm2 method, of class ModelQuestionHalf.
     */
    @Test
    public void testSetTerm2() {
        System.out.println("Inicia Test setTerm2 ModelQuestionsHalf");        
        double term2 = 56.0;
        ModelQuestionHalf instance = new ModelQuestionHalf();
        instance.setTerm2(term2);
        double result = instance.getTerm2();
        assertEquals(term2, result, 0.0);
    }

    /**
     * Test of getTerm3 method, of class ModelQuestionHalf.
     */
    @Test
    public void testGetTerm3() {
        System.out.println("Inicia Test getTerm3 ModelQuestionsHalf");
        ModelQuestionHalf instance = new ModelQuestionHalf();
        double expResult = 89.0;
        instance.setTerm3(expResult);
        double result = instance.getTerm3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTerm3 method, of class ModelQuestionHalf.
     */
    @Test
    public void testSetTerm3() {
        System.out.println("Inicia Test setTerm3 ModelQuestionsHalf");
        double term3 = 973.0;
        ModelQuestionHalf instance = new ModelQuestionHalf();
        instance.setTerm3(term3);
        double result = instance.getTerm3();
        assertEquals(term3, result, 0.0);
    }

    /**
     * Test of getOperator1 method, of class ModelQuestionHalf.
     */
    @Test
    public void testGetOperator1() {
        System.out.println("Inicia Test getOperator1 ModelQuestionsHalf");
        ModelQuestionHalf instance = new ModelQuestionHalf();
        String expResult = "/";
        instance.setOperator1(expResult);
        String result = instance.getOperator1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperator1 method, of class ModelQuestionHalf.
     */
    @Test
    public void testSetOperator1() {
        System.out.println("Inicia Test setOperator1 ModelQuestionsHalf");
        String operator1 = "*";
        ModelQuestionHalf instance = new ModelQuestionHalf();
        instance.setOperator1(operator1);
        String result = instance.getOperator1();
        assertEquals(result, operator1);
    }

    /**
     * Test of getOperator2 method, of class ModelQuestionHalf.
     */
    @Test
    public void testGetOperator2() {
        System.out.println("Inicia Test getOperator2 ModelQuestionsHalf");
        ModelQuestionHalf instance = new ModelQuestionHalf();
        String expResult = "/";
        instance.setOperator2(expResult);
        String result = instance.getOperator2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperator2 method, of class ModelQuestionHalf.
     */
    @Test
    public void testSetOperator2() {
        System.out.println("Inicia Test setOperator2 ModelQuestionsHalf");
        String operator1 = "*";
        ModelQuestionHalf instance = new ModelQuestionHalf();
        instance.setOperator2(operator1);
        String result = instance.getOperator2();
        assertEquals(result, operator1);
    }

    /**
     * Test of getResult method, of class ModelQuestionHalf.
     */
    @Test
    public void testGetResult() {
        System.out.println("Inicia Test getResult ModelQuestionsHalf");
        ModelQuestionHalf instance = new ModelQuestionHalf();
        double expResult = 230.0;
        instance.setResult(expResult);
        double result = instance.getResult();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setResult method, of class ModelQuestionHalf.
     */
    @Test
    public void testSetResult() {
        System.out.println("Inicia Test setResult ModelQuestionsHalf");
        double result_2 = 306.0;
        ModelQuestionHalf instance = new ModelQuestionHalf();
        instance.setResult(result_2);
        double result = instance.getResult();
        assertEquals(result, result_2, 0.0);
    }
    
}
