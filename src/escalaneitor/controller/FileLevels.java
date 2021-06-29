/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalaneitor.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author jaicom025
 */
public class FileLevels {
    
    public void escribirNivelArchivo (String texto){
        try {
            String ruta = "files/levels.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void inicializarArchivoNivel (){
        try {
            FileOutputStream writer = new FileOutputStream("files/levels.txt");
            writer.write(("").getBytes());
            writer.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String leerArchivo (){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("files/levels.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         linea = br.readLine();
         return linea;
         //while((linea=br.readLine())!=null)
            //System.out.println(linea);
      }catch(Exception e){
        e.printStackTrace();
        return null;
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
}
