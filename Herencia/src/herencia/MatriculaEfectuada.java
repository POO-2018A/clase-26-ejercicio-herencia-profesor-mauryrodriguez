/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Usuario
 */
public class MatriculaEfectuada {
    private String Nombre;
    private String Materia;

    public MatriculaEfectuada(String Nombre, String Materia) {
        this.Nombre = Nombre;
        this.Materia = Materia;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    
    
}
