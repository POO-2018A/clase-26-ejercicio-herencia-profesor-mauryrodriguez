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
public class Profesor extends Persona implements Serializable {
   
   private String facultad;
   private Materia materia;

    public Profesor(String nombre, String apellido,String facultad, Materia materia) {
        super(nombre, apellido);
        this.facultad = facultad;
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return nombre+" " + apellido +" " + facultad+ " " +  materia ;
    }

   


   
   
    
    
}
