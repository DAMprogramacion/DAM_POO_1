package teoria;

/**
 * Clase Circulo, con métodos para calcular superficie y longitud
 * @author manuel
 * @version 1.0.0
 */
public class Circulo {
    private float radio = 10;

    /**
     * Getter del atributo radio
     * @return el valor del radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Método que calcula la superficie del círculo
     * @return el resultado
     */
    public float getSuperficie() {
        return (float) (Math.PI * radio * radio);
    }

    /**
     * Método que calcula la longitud del círculo
     * @return el resultado
     */
    public float getPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
