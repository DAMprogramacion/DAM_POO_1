package ejercicios.ejercicio2;

public class TrianguloRectanguloV1 {
    private int cateto1;
    private int cateto2;

    public TrianguloRectanguloV1(int cateto1, int cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public int getCateto1() {
        return cateto1;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }
    public double calcularHipotenusa ( ) {
        return Math.hypot(cateto1, cateto2);
    }
    public double calcularArea () {
        return cateto1 * cateto2 / 2.0;
    }
    public double calcularPerimetro () {
        return cateto1 + cateto2 + calcularHipotenusa();
    }

    @Override
    public String toString() {
        return String.format("TRIÁNGULO RECTÁNGULO, cateto %d, cateto %d," +
                        "hipotenusa %.2f, perímetro %.2f y área %.2f%n", cateto1, cateto2,
                calcularHipotenusa(), calcularPerimetro(), calcularArea());
    }
}
