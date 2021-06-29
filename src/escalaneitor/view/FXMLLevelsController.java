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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author jaicom025
 */
public class FXMLLevelsController implements Initializable {

    private Stage stagePrincipal;
    private Escalaneitor ProgramaPrincipal = new Escalaneitor();
    
    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void viewQuestion(ActionEvent event) {
        ProgramaPrincipal.mostrarMenuAdministrador(event);
        /*try {
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("view/FXMLQuestionEasy.fxml"));
            Scene scene = new Scene(root,400,400);
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            stagePrincipal.setTitle("Hello World");

            //root.getChildren().add(imageView);
            stagePrincipal.setScene(scene);
            stagePrincipal.show();
        } catch(Exception e) {
            e.printStackTrace();
        }*/
        
        //try{
            //Stage stage = new Stage();
            //Parent root = FXMLLoader.load(getClass().getResource("view/FXMLQuestionEasy.fxml"));
            //Scene scene = new Scene(root);
            //stage = new Stage(StageStyle.DECORATED);
            //stage.setScene(scene);
            //stage.show();
            //ProgramaPrincipal.ventanaQuestions(event);
        //}catch(IOException e){
            //System.out.println("Error al abrir la nueva ventana de preguntas -->>  "+e.getMessage());
        //}
        
    }
    
}
