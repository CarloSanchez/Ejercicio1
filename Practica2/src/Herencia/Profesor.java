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
    
    public Profesor()
    {}
    
   public void enseñar ()
  {System.out.println("El profesor esta enseñando en el aula c(104)");}

   public void evaluar()
  {System.out.println("El profesor esta evaluando a los alumnos de sistemas grupo 2");}

   public void ayuda()
  {System.out.println("El profesor ayuda a sus alumnos con los ejercicios mas complicados");}


}
