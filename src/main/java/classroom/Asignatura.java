package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    private int codigoInterno;
    private int codigoExterno;

    Asignatura() {
        this("Sin nombre", 0, 0);
    }

    Asignatura(String tipo, int codigo) {
        this("Sin nombre", codigo, codigo);
        if (tipo.equals("int")) {
            this.codigoExterno = 0;
        } else if (tipo.equals("ext")) {
            this.codigoInterno = 0;
        } else {
            this.codigoInterno = 0;
            this.codigoExterno = 0;
        }
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatos(String tipo, int cod) {
        if (tipo.equals("int")) {
            this.setCodigoInterno(cod);
        } else if (tipo.equals("ext")) {
            this.setCodigoExterno(cod);
        } else {
            this.setCodigoInterno(cod);
            this.setCodigoExterno(cod);
        }
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoExterno(double codigoExterno) {
        this.codigoExterno = (int) codigoExterno;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

}
