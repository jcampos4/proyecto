
package persona;

/**
 *
 * @author Jose DAW
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;

    public Persona (Persona persona){ //constructor
        nombre = "";
        apellidos = "";
        edad = 0;
        casado = false;
        
    }
    //metodos 
    public void setNombre(String valornombre){
        nombre = "nombre: " + valornombre;
    }
    public void setApellidos(String valorapellidos){
        apellidos = "apellidos: " + valorapellidos;
    }
    public void setEdad(int valoredad){
        edad = valoredad;
    }
}