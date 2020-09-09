package classroom;

public class Persona {

    long cedula;
    String nombre;
    private static int totalPersonas;
    private static int noIdentificados = 0;

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
        //Hay que colocar modificador aqui para que no se repita la cedula.
        //O Eliminar porque no se deberia poder ingresar una persona sin documento.
        this.cedula = getNoIdentificados();
        this.nombre = nombre;
        noIdentificados++;
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

    public static int getTotalPersonas() {
        return totalPersonas;
    }

    public static void setTotalPersonas(int totalPersonas) {
        Persona.totalPersonas = totalPersonas;
    }

    public static int getNoIdentificados() {
        return noIdentificados;
    }

    public static void setNoIdentificados(int noIdentificados) {
        Persona.noIdentificados = noIdentificados;
    }
    
    
}
