package ejercicios.ejercio4;

public class SistemaEcuaciones {
    //atributos
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    //constructor


    public SistemaEcuaciones(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
    public boolean esResoluble() {
        return a * d - b * c != 0;
    }
    public double calcularX () {
        return  1.0 * (e * d - b * f) / (a * d - b * c);
    }
    public double calcularY () {
        return  1.0 * (a * f - e * c) / (a * d - b * c);
    }

    @Override
    public String toString() {
        return String.format("SOLUCIÓN: X = %.2f e Y = %.2f",
                                 calcularX(), calcularY() );
    }
}








