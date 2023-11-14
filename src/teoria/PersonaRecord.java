package teoria;

public record PersonaRecord(int edad, float peso) {
    public PersonaRecord(int edad) {
        this(edad, 80);
    }
    public PersonaRecord () {
        this(18);
    }
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return String.format("PERSONA con edad %d y peso %.3f", edad, peso);
    }
    public static PersonaRecord recienNacido(float peso) {
        return new PersonaRecord(0, peso);
    }
}
