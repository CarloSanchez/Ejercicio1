/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona 
{
    
    String Cod_doc;
    String colegio;
    
    public Profesor(String Cod_doc, String colegio, String nombre )
    {
      this.Cod_doc=Cod_doc;
      this.colegio=colegio;
      this.nombre=nombre;
    }
    
   public void enseñar ()
  {System.out.println("Hola soy "+this.nombre+" y sere su asesor este año");}

   public void presentacion()
  {System.out.println("Bienvenidos al colegio "+this.colegio+" con codigo "+this.Cod_doc+"");}

   public void ayuda()
  {System.out.println("El profesor ayuda a sus alumnos con los ejercicios mas complicados");}


}
