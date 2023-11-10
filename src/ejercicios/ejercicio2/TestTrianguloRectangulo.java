package ejercicios.ejercicio2;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        TrianguloRectangulo tRectangulo = new TrianguloRectangulo();
        tRectangulo.setCateto1(3);
        tRectangulo.setCateto2(5);
        System.out.printf("Cateto 1: %d%n", tRectangulo.getCateto1());
        System.out.printf("Cateto 2: %d%n", tRectangulo.getCateto2());
        System.out.printf("Hipotenusa: %.2f%n", tRectangulo.calcularHipotenusa());
        System.out.printf("Perímetro: %.2f%n", tRectangulo.calcularPerimetro());
        System.out.printf("Área: %.2f%n", tRectangulo.calcularArea());
        System.out.println(tRectangulo);
        System.out.println("===========V1=============");
        TrianguloRectanguloV1 trianguloRectanguloV1 =
                new TrianguloRectanguloV1(6, 9);
        System.out.print(trianguloRectanguloV1);

    }
}
