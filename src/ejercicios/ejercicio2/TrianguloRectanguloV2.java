package ejercicios.ejercicio2;

public record TrianguloRectanguloV2 (int cateto1, int cateto2){
    public double getHipotenusa () {
        return Math.hypot(cateto1, cateto2);
    }
    public double getPerimetro() {
        return cateto1 + cateto2 + getHipotenusa();
    }
    public double getArea() {
        return cateto1 * cateto2 / 2.0;
    }

    @Override
    public String toString() {
        return String.format("TRIÁNGULO RECTÁNGULO");
    }
}
