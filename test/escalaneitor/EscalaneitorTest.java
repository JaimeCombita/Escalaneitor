/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nelson Fernandez
 */
public class EscalaneitorTest {
    
    public EscalaneitorTest() {
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
     * Test of start method, of class Escalaneitor.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        Escalaneitor instance = new Escalaneitor();
        instance.start(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVentanaPrincipal method, of class Escalaneitor.
     */
    @Test
    public void testMostrarVentanaPrincipal() {
        System.out.println("mostrarVentanaPrincipal");
        Escalaneitor instance = new Escalaneitor();
        instance.mostrarVentanaPrincipal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevaVentana method, of class Escalaneitor.
     */
    @Test
    public void testNuevaVentana() {
        System.out.println("nuevaVentana");
        ActionEvent event = null;
        Escalaneitor instance = new Escalaneitor();
        instance.nuevaVentana(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Escalaneitor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Escalaneitor.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
