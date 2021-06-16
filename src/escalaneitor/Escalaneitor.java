/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor;

import escalaneitor.view.FXMLHomeController;
import escalaneitor.view.FXMLLevelsController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author jaicom025
 */
public class Escalaneitor extends Application {
    
    /**
     * variables que son utilizadas para reemplazar los Scene y mostrar las dferentes escenas 
     * segun flujo en que se encuentre en el juego
     */
    private Stage stagePrincipal;
    private AnchorPane rootPane;
    
    @Override
    /**
     * Este metodo es por donde inicia el juego
     */
    public void start(Stage stage) throws Exception {
        /**
         * aqui seteamos el valor del stage y hacemos el llamado al metodo mostrarVentanaPrincipal
         * que se encarga de mostrar el escenario
         */
        this.stagePrincipal = stage;
        mostrarVentanaPrincipal();
        
        //Parent root = FXMLLoader.load(getClass().getResource("view/FXMLHome.fxml"));
 
        //Scene scene = new Scene(root);
 
        //stage.setScene(scene);
        //stage.setTitle("Escalaneitor");
        //stage.getIcons().add(new Image("file:resources/icon-app.png"));
        //stage.show();
    }
    
    /**
     * este metodo se encarga de mostrar la ventana principal del juego, asignar titulo e icono
     */
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/FXMLHome.fxml"));
            rootPane = (AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Escalaneitor - Inicio");
            stagePrincipal.getIcons().add(new Image("file:resources/icon-app.png"));
            stagePrincipal.setScene(scene);
            FXMLHomeController controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        } catch (IOException e) {
            System.out.println("Error al abrir la mostrar ventana principal  -->>  "+e.getMessage());
        }
    }
    
    /**
     * este metodo muestra la ventana de niveles para ver el progreso del juego
     */
    public void nuevaVentana(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Escalaneitor.class.getResource("view/FXMLLevels.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Escalaneitor - Niveles");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);
            FXMLLevelsController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
 
        } catch (IOException e) {
            System.out.println("Error al abrir la nueva ventana  -->>  "+e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
