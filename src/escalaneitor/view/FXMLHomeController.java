/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.view;

import escalaneitor.Escalaneitor;
import escalaneitor.controller.GeneratorQuestion;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jaicom025
 */
public class FXMLHomeController implements Initializable {
    
    private Escalaneitor ProgramaPrincipal;
    @FXML
    private ImageView botonIniciar;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
 
    public void setProgramaPrincipal(Escalaneitor ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
    
    private void handleButtonAction(ActionEvent event) {
        GeneratorQuestion q = new GeneratorQuestion();
        q.generateQuestionEasy();
        ProgramaPrincipal.nuevaVentana(event);
    }

    @FXML
    private void iniciarNiveles(MouseEvent event) {       
        try {
            FXMLLoader loader = new FXMLLoader(Escalaneitor.class.getResource("view/FXMLLevels.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Escalaneitor - Niveles");            
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);
            FXMLLevelsController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
 
        } catch (IOException e) {
            System.out.println("Error al abrir la nueva ventana  -->>  "+e.getMessage());
        }
    }
    
}
