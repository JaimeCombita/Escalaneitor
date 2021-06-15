package escalaneitor.niveles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Robert
 */
public class Niveles {
    // atributos 
    boolean respuestaSeleccionada;
    int nivelActual=0;
    Image abierto = new Image(getClass().getResourceAsStream("resources/abierto.png"));    
    Image bloqueado = new Image(getClass().getResourceAsStream("resources/bloqueado.png"));
    Image superado = new Image(getClass().getResourceAsStream("resources/superado.png"));
    
    
    
    // metodo para Siguiente Nivel
    public void sigNivel (){
        if (respuestaSeleccionada == true) {
            nivelActual = nivelActual + 1;
            System.out.println("Felicidades, pasaste al nivel "+nivelActual);
        }
    }
    
    // metodo para iniciar todos los niveles en bloqueado excento el primero
    public void estadoInicial (){
        for (int i = 0; i < 15; i++) {
            if (nivelActual == 0) {
                ImageView estadoAbierto;    
                estadoAbierto = new ImageView(abierto);
            } else {            
                 ImageView estadoBloqueado;
                 estadoBloqueado = new ImageView(bloqueado);
            }
        }
    }
    
    // metodo para colocar imagen de nivel superado
    public void nivelSuperado (){
        if (respuestaSeleccionada == true) {
            ImageView estadoSuperado = new ImageView(superado);    
        }
    }
    
    // metodo para colocar imagen de nivel abierto al siguiente nivel
    public void nivelAbierto (){ 
        if (respuestaSeleccionada == true) {
            //seleccionamos el siguiente nivel
            ImageView estadoAbierto;    
            estadoAbierto = new ImageView(abierto);    
        }
    }   
}