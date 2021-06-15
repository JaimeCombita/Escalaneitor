package escalaneitor.niveles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Robert
 */
public class Niveles {
    /**
     * atributos que se usan en la clase junto con los metodos getter y setter
    */
    final Image abierto = new Image(getClass().getResourceAsStream("resources/abierto.png"));    
    final Image bloqueado = new Image(getClass().getResourceAsStream("resources/bloqueado.png"));
    final Image superado = new Image(getClass().getResourceAsStream("resources/superado.png"));
    
    private boolean respuestaSeleccionada;
    
    private int nivelActual = 0;

    public boolean isRespuestaSeleccionada() {
        return respuestaSeleccionada;
    }

    public void setRespuestaSeleccionada(boolean respuestaSeleccionada) {
        this.respuestaSeleccionada = respuestaSeleccionada;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }
    
    
    /** 
     * metodo para asignar el Siguiente Nivel, dependiendo de la valides de la respuesta
    */
    public void sigNivel (){
        if (respuestaSeleccionada == true) {
            nivelActual = nivelActual + 1;
            System.out.println("Felicidades, pasaste al nivel "+nivelActual);
        }
    }
    
    /** 
     * metodo para iniciar todos los niveles en bloqueado excepto el primero
    */
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
    
    /** 
     * metodo para colocar imagen de nivel superado
    */
    public void nivelSuperado (){
        if (respuestaSeleccionada == true) {
            ImageView estadoSuperado = new ImageView(superado);    
        }
    }
    
    /** 
     * metodo para colocar imagen de nivel abierto al siguiente nivel
    */ 
    public void nivelAbierto (){ 
        if (respuestaSeleccionada == true) {
            //seleccionamos el siguiente nivel
            ImageView estadoAbierto;    
            estadoAbierto = new ImageView(abierto);    
        }
    }   
}