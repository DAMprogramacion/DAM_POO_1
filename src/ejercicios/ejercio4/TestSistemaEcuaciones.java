package ejercicios.ejercio4;

import java.util.Scanner;

public class TestSistemaEcuaciones {


    public static void main(String[] args) {
        SistemaEcuaciones s1 = getSistemaEcuaciones();
        /*System.out.println(s1.esResoluble());
        System.out.println(s1.calcularX());
        System.out.println(s1.calcularY());
        System.out.println(s1);*/
        if (s1.esResoluble())
            System.out.println(s1);
        else
            System.out.println("No se puede resolver");

    }

    private static SistemaEcuaciones getSistemaEcuaciones() {
        Scanner sc = new Scanner(System.in);
        //código lectura de los coeficientes
        System.out.println("Dame coeficiente a");
        int a = sc.nextInt();
        System.out.println("Dame coeficiente b");
        int b = sc.nextInt();
        System.out.println("Dame coeficiente c");
        int c = sc.nextInt();
        System.out.println("Dame coeficiente d");
        int d = sc.nextInt();
        System.out.println("Dame coeficiente e");
        int e = sc.nextInt();
        System.out.println("Dame coeficiente f");
        int f = sc.nextInt();
        sc.close();
        return new SistemaEcuaciones(a, b, c, d, e, f);
    }
}
