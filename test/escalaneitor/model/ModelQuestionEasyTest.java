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
        System.out.println("getTerm1");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        double expResult = 0.0;
        double result = instance.getTerm1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerm1 method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetTerm1() {
        System.out.println("setTerm1");
        double term1 = 0.0;
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setTerm1(term1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerm2 method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetTerm2() {
        System.out.println("getTerm2");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        double expResult = 0.0;
        double result = instance.getTerm2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerm2 method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetTerm2() {
        System.out.println("setTerm2");
        double term2 = 0.0;
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setTerm2(term2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperator method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        String expResult = "";
        String result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        String operator = "";
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class ModelQuestionEasy.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        ModelQuestionEasy instance = new ModelQuestionEasy();
        double expResult = 0.0;
        double result = instance.getResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class ModelQuestionEasy.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        double result_2 = 0.0;
        ModelQuestionEasy instance = new ModelQuestionEasy();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
