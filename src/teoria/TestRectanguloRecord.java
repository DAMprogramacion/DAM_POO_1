package teoria;

public class TestRectanguloRecord {
    public static void main(String[] args) {
        RectanguloRecord rectangulo1 = new RectanguloRecord(3, 2);
        System.out.println(rectangulo1);
        System.out.println("alto: " + rectangulo1.alto());
        //rectangulo1.alto() = 5; No es posible, porque es inmutable el objeto

    }
}
