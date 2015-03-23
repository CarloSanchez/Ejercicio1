/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Carlitos
 */
public class Persona {
    
    String nombre;
    int edad;
    String profesion;
    
    public Persona(){//siempre se tiene que crear el constructor
    }
    
    public void saludar()
    {
    System.out.println("Buen dia, sea bienvenido");
    }
    
    public void despedir()
    {
    System.out.println("Muchas gracias por su visita");
    }
    
    
    
}
