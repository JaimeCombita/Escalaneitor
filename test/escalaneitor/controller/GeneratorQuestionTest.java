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
        System.out.println("Inicia Test generateQuestionEasy");
        GeneratorQuestion instance = new GeneratorQuestion();
        ModelQuestionEasy result = instance.generateQuestionEasy();
        System.out.println("RESULTADO GENERACION PREGUNTA FACIL  -->>  "+result.getTerm1());
        assertNotNull(result);
    }

    /**
     * Test of generateQuestionHalf method, of class GeneratorQuestion.
     */
    @Test
    public void testGenerateQuestionHalf() {
        System.out.println("Iniciando test generateQuestionHalf");
        GeneratorQuestion instance = new GeneratorQuestion();
        ModelQuestionHalf result = instance.generateQuestionHalf();
        assertNotNull(result);
    }

    /**
     * Test of generateQuestionHard method, of class GeneratorQuestion.
     */
    @Test
    public void testGenerateQuestionHard() {
        System.out.println("Inicia test generateQuestionHard");
        GeneratorQuestion instance = new GeneratorQuestion();
        ModelQuestionHard result = instance.generateQuestionHard();
        assertNotNull(result);
    }
    
}
