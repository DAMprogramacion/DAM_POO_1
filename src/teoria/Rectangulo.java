package teoria;

import static java.lang.Math.hypot;

public class Rectangulo {
    private int alto;
    private int ancho;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    //tres métodos: calculo del área, cálculo del perímetro y cálculo de la diagonal
    public int getArea() {

        return alto * ancho;
    }
    public int getPerimetro() {
        return alto + ancho + alto + ancho;
    }
    public double getDiagonal() {
        return hypot(alto , ancho);
    }

    @Override
    public String toString() {

        return "RECTÁNGULO: alto " + alto + ", ancho: " + ancho;
    }
}
