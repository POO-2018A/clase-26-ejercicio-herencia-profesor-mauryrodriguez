/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debermatricula;

import java.util.Objects;


public class Profesor extends Persona{
    
    private String facultad;
    private String materiaElegida;
    
    public Profesor(String nombre, String apellido, String facultad, String materiaElegida) {

        super(nombre,apellido);
        this.facultad = facultad;
        this.materiaElegida = materiaElegida;
    }

    public String getMateriaElegida() {
        return materiaElegida;
    }

    public void setMateriaElegida(String materiaElegida) {
        this.materiaElegida = materiaElegida;
    }


    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return materiaElegida ;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.materiaElegida, other.materiaElegida)) {
            return false;
        }
        return true;
    }

    
    
}
