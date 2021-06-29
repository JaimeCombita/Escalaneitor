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
import javafx.scene.control.Control;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jaicom025
 */
public class FXMLLevelsController implements Initializable {

    private Stage stagePrincipal;
    private Escalaneitor ProgramaPrincipal = new Escalaneitor();
    @FXML
    public Button btnLevel1;
    public Button btnLevel2;
    public Button btnLevel3;
    public Button btnLevel4;
    public Button btnLevel5;
    public Button btnLevel6;
    public Button btnLevel7;
    public Button btnLevel8;
    public Button btnLevel9;
    public Button btnLevel10;
    public Button btnLevel11;
    public Button btnLevel12;
    public Button btnLevel13;
    public Button btnLevel14;
    public Button btnLevel15;
    
    public String level;
    
    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FileLevels txt = new FileLevels();
        level = txt.leerArchivo();
        pintarNiveles();
    }
    
    @FXML
    private void viewQuestion(ActionEvent event) {
        String btnAnswer = ((Control)event.getSource()).getId().replace("btnLevel", "");
        System.out.println("idBotonLevel-->>"+btnAnswer);
        if(btnAnswer.equals(level)){
            ProgramaPrincipal.mostrarVentanaQuestions(event);
        }
    }
    
    private void pintarNiveles(){
        /**
         * leer archivo de niveles para asignar la imagen y bloquear niveles
         */
        switch (level){
            case "1":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/1.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/block.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/block.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/block.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/block.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/block.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/block.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "2":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/2.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/block.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/block.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/block.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/block.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/block.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "3":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/3.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/block.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/block.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/block.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/block.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "4":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/4.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/block.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/block.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/block.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "5":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/5.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/block.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/block.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "6":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/6.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/block.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "7":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/7.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/block.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "8":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/8.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/block.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "9":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/9.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/block.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "10":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/10.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/block.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;    
            case "11":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/check.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/11.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/block.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;    
            case "12":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/check.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/check.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/12.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/block.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "13":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/check.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/check.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/check.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/13.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/block.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "14":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/check.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/check.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/check.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/check.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/14.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/block.png');");
                break;
            case "15":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/check.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/check.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/check.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/check.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/check.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/15.png');");
                break;
            case "16":
                btnLevel1.setStyle("-fx-background-image: url('file:resources/nivel1/check.png');");
                btnLevel2.setStyle("-fx-background-image: url('file:resources/nivel2/check.png');");
                btnLevel3.setStyle("-fx-background-image: url('file:resources/nivel3/check.png');");
                btnLevel4.setStyle("-fx-background-image: url('file:resources/nivel4/check.png');");
                btnLevel5.setStyle("-fx-background-image: url('file:resources/nivel5/check.png');");
                btnLevel6.setStyle("-fx-background-image: url('file:resources/nivel6/check.png');");
                btnLevel7.setStyle("-fx-background-image: url('file:resources/nivel7/check.png');");
                btnLevel8.setStyle("-fx-background-image: url('file:resources/nivel8/check.png');");
                btnLevel9.setStyle("-fx-background-image: url('file:resources/nivel9/check.png');");
                btnLevel10.setStyle("-fx-background-image: url('file:resources/nivel10/check.png');");
                btnLevel11.setStyle("-fx-background-image: url('file:resources/nivel11/check.png');");
                btnLevel12.setStyle("-fx-background-image: url('file:resources/nivel12/check.png');");
                btnLevel13.setStyle("-fx-background-image: url('file:resources/nivel13/check.png');");
                btnLevel14.setStyle("-fx-background-image: url('file:resources/nivel14/check.png');");
                btnLevel15.setStyle("-fx-background-image: url('file:resources/nivel15/check.png');");
                break;
            default:
                System.out.println("Error Nivel no coincide para pintar niveles");
                break;
        }
    }
    
}
