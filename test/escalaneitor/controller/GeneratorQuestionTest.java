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
public class GeneratorQuestionTest {
    
    public GeneratorQuestionTest() {
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
     * Test of generateQuestionEasy method, of class GeneratorQuestion.
     */
    @Test
    public void testGenerateQuestionEasy() {
        System.out.println("generateQuestionEasy");
        GeneratorQuestion instance = new GeneratorQuestion();
        ModelQuestionEasy expResult = null;
        ModelQuestionEasy result = instance.generateQuestionEasy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateQuestionHalf method, of class GeneratorQuestion.
     */
    @Test
    public void testGenerateQuestionHalf() {
        System.out.println("generateQuestionHalf");
        GeneratorQuestion instance = new GeneratorQuestion();
        ModelQuestionHalf expResult = null;
        ModelQuestionHalf result = instance.generateQuestionHalf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateQuestionHard method, of class GeneratorQuestion.
     */
    @Test
    public void testGenerateQuestionHard() {
        System.out.println("generateQuestionHard");
        GeneratorQuestion instance = new GeneratorQuestion();
        ModelQuestionHard expResult = null;
        ModelQuestionHard result = instance.generateQuestionHard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
