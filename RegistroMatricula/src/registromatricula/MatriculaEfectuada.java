/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registromatricula;

/**
 *
 * @author Usuario
 */
import java.io.Serializable;
public class MatriculaEfectuada implements Serializable {
    private Estudiante estudiante;
    private Materia materia;

    public MatriculaEfectuada(Estudiante estudiante, Materia materia) {
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return   estudiante + " " + materia;
    }

    
    
    
}
