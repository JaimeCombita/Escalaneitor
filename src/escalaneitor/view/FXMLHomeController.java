/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.view;

import escalaneitor.Escalaneitor;
import static escalaneitor.Escalaneitor.main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jaicom025
 */
public class FXMLHomeController implements Initializable {
    
    private Escalaneitor ProgramaPrincipal;
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
 
    public void setProgramaPrincipal(Escalaneitor ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Dio Clic en boton iniciar");
        ProgramaPrincipal.nuevaVentana(event);
    }
    
}
