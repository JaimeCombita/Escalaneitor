/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.view;

import escalaneitor.Escalaneitor;
import escalaneitor.controller.FileLevels;
import escalaneitor.controller.GeneratorQuestion;
import escalaneitor.model.ModelQuestionEasy;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author jaicom025
 */
public class FXMLQuestionEasyController implements Initializable {

    @FXML
    public Label question;
    @FXML
    public Button answer1;
    @FXML
    public Button answer2;
    @FXML
    public Button answer3;
    @FXML
    public Label answerResult;
    @FXML
    public Label levelQ;
    
    public String level;
    
    private int indexAnswer;
    private Stage stagePrincipal;
    FileLevels txt = new FileLevels();
    private Escalaneitor ProgramaPrincipal;
    
    ModelQuestionEasy pregunta = new ModelQuestionEasy();
    @FXML
    private Button answer11;
    @FXML
    private ImageView volver;
    
    private void init() {
        level = txt.leerArchivo();
        levelQ.setText("Nivel "+level);
        GeneratorQuestion q = new GeneratorQuestion();
        pregunta = q.generateQuestionEasy();
        question.setText("( "+Math.round(pregunta.getTerm1())+" "+pregunta.getOperator()+" "+Math.round(pregunta.getTerm2())+" ) = ?");
        indexAnswer = (int) Math.floor(Math.random()*3);
        System.out.println("ID Respuesta correcta -->> "+indexAnswer);
        answer1.setText(indexAnswer == 0 ? String.valueOf(Math.round(pregunta.getResult())) : String.valueOf(Math.round(Math.floor(Math.random()*100+1))));
        answer2.setText(indexAnswer == 1 ? String.valueOf(Math.round(pregunta.getResult())) : String.valueOf(Math.round(Math.floor(Math.random()*100+1))));
        answer3.setText(indexAnswer == 2 ? String.valueOf(Math.round(pregunta.getResult())) : String.valueOf(Math.round(Math.floor(Math.random()*100+1))));
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
    }
    
    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }
    
    @FXML
    public void validaRespuesta(Event evento){
        String btnAnswer = ((Control)evento.getSource()).getId();
        switch (indexAnswer){
            case 0:
                if("answer1".equals(btnAnswer)){
                    answerResult.setText("Respuesta Correcta");
                    txt.inicializarArchivoNivel();
                    int nivel = Integer.parseInt(level);
                    nivel++;
                    txt.escribirNivelArchivo(String.valueOf(nivel));
                }else{
                    answerResult.setText("Respuesta Incorrecta");
                }
                break;
            case 1:
                if("answer2".equals(btnAnswer)){
                    answerResult.setText("Respuesta Correcta");
                    txt.inicializarArchivoNivel();
                    int nivel = Integer.parseInt(level);
                    nivel++;
                    txt.escribirNivelArchivo(String.valueOf(nivel));
                }else{
                    answerResult.setText("Respuesta Incorrecta");
                }
                break;
            case 2:
                if("answer3".equals(btnAnswer)){
                    answerResult.setText("Respuesta Correcta");
                    txt.inicializarArchivoNivel();
                    int nivel = Integer.parseInt(level);
                    nivel++;
                    txt.escribirNivelArchivo(String.valueOf(nivel));
                }else{
                    answerResult.setText("Respuesta Incorrecta");
                }
                break;
            default:
                System.out.println("indice de respuesta incorrecto");
                break;
                    
        }
    }
    
    @FXML
    private void cerrarVentana(ActionEvent event) {
        try {
            //ProgramaPrincipal.mostrarVentanaLevels(event);
            Stage stage = (Stage) this.answer11.getScene().getWindow();
            stage.close();
            //stage.hide();
            //stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("view/FXMLLevels.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLQuestionEasyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void volverNiveles(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("view/FXMLLevels.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
