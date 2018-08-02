/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registromatricula;

/**
 *
 * @author ESFOT
 */
import java.io.Serializable;
public class Persona implements Serializable {
   protected String nombre;
   protected String apellido;
   private String paisNacimiento; 

   public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }
    
    
}
