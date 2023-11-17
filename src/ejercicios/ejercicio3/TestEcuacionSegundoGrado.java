package ejercicios.ejercicio3;

public class TestEcuacionSegundoGrado {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Faltan los coeficientes");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        EcuacionSegundoGrado e1 = new EcuacionSegundoGrado(a, b, c);
        /*System.out.printf("Valor de a %d%n", e1.a());
        System.out.println(e1.toString());*/
        if ( !e1.esResoluble() )
            System.out.printf("No se puede resolver %s%n", e1);
        else {
            System.out.println(e1);
            System.out.printf("X1 = %.2f%n", e1.calcularX1());
            System.out.printf("X2 = %.2f%n", e1.calcularX2());
        }
    }
}
