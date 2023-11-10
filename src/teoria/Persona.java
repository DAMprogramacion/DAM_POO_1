package teoria;
//ejemplo sencillo de creación de constructores
public class Persona {
    private String nombreCompleto;
    private int edad;

    public Persona(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public Persona() {

    }

    public Persona(int edad) {
        this.edad = edad;
        nombreCompleto = "Anónimo";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%S: %d%n",
                nombreCompleto, edad);
    }
    public boolean esMayorDeEdad () {
        return edad >= 18;
    }
}
