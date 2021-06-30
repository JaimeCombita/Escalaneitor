/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.view;

import escalaneitor.Escalaneitor;
import escalaneitor.controller.FileLevels;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author jaicom025
 */
public class FXMLHomeController implements Initializable {
    
    private Escalaneitor ProgramaPrincipal;
    @FXML
    public Button btnIniciar;
    public Button btnCont;
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FileLevels txt = new FileLevels();
        txt.inicializarArchivoNivel();
        txt.escribirNivelArchivo("1");
        this.btnCont.setVisible(false);
    }
 
    public void setProgramaPrincipal(Escalaneitor ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
    
    @FXML
    private void startGame(ActionEvent event) {
        btnIniciar.setVisible(false);
        this.btnCont.setVisible(true);
        ProgramaPrincipal.mostrarVentanaLevels(event);
    }
    
}
