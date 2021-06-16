/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.view;

import escalaneitor.Escalaneitor;
import java.net.URL;
import java.util.ResourceBundle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author efernandez
 */
public class FXMLHomeControllerTest {
    
    public FXMLHomeControllerTest() {
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
     * Test of initialize method, of class FXMLHomeController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLHomeController instance = new FXMLHomeController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgramaPrincipal method, of class FXMLHomeController.
     */
    @Test
    public void testSetProgramaPrincipal() {
        System.out.println("setProgramaPrincipal");
        Escalaneitor ProgramaPrincipal = null;
        FXMLHomeController instance = new FXMLHomeController();
        instance.setProgramaPrincipal(ProgramaPrincipal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
