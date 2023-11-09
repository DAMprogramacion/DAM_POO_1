package teoria;

public class TestCirculo {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(); //creando un objeto Circulo
       //circulo.radio = 15;
        System.out.printf("Radio  %.2f%n", circulo.getRadio());
        System.out.printf("Longitud  %.2f%n", circulo.getPerimetro());
        System.out.printf("Superficie  %.2f%n", circulo.getSuperficie());

    }
}
