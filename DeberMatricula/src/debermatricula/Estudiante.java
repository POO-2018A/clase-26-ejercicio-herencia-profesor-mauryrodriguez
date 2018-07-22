
package debermatricula;

public class Estudiante extends Persona {    
   
    private int edad;

    public Estudiante(String nombre, String apellido, int edad) {

        super(nombre,apellido);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
  
