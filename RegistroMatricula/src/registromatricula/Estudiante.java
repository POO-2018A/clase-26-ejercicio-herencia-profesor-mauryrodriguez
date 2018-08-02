/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registromatricula;
import java.io.Serializable;
/**
 *
 * @author ESFOT
 */
public class Estudiante extends Persona implements Serializable { 

     private String edad;
    public Estudiante(String nombre, String apellido,String edad) {
        super(nombre, apellido);
        this.edad = edad;
       
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " "+ apellido + " "+  edad ;
    }   
    
    
}
