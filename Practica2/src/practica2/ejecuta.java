/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Carlitos
 */
import Herencia.Persona;
import Herencia.Profesor;
import Herencia.Postulante;
import Herencia.abstraer;

public class ejecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Profesor profesor = new Profesor("029193","San Juan","Manuel");
        
        
        profesor.presentacion();
        profesor.enseñar();
    }
    
}
