package ejercicios.ejercicio3;
//Ecuación segundo grado a · x² + b · x + c = 0
public record EcuacionSegundoGrado(int a, int b, int c) {
    public boolean esResoluble() {
        return b * b - 4 * a * c >= 0;
    }
    public double calcularX1() {
        return -b - Math.sqrt(b * b - 4 * a * c) / ( 2 * a);
    }
    public double calcularX2() {
        return -b + Math.sqrt(b * b - 4 * a * c) / ( 2 * a);
    }
}
