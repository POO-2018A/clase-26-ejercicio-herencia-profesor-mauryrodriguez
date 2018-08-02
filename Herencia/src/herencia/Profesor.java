/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ESFOT
 */
public class Profesor extends Persona {
   
   private String facultad;
   private String materia;
    

    public Profesor(String nombre,String apellido, String facultad, String materia){
        super(nombre, apellido);
        this.facultad=facultad;
        this.materia=materia;
    
    } 

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" + "facultad=" + facultad + ", materia=" + materia + '}';
    }
   
    
    
}
