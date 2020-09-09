package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;

    static {
        totalPersonas = 0;
    }

    Persona(long cedula, String nombre) { 
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        //Hay que colocar modificador aquí para que no se repita la cedula.
        //O Eliminar porque no se debería poder ingresar una persona sin documento.
        this.cedula = totalPersonas + 100000;
        this.nombre = nombre;
        totalPersonas++;
    }

    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
