package ejercicios.ejercicio1;

public class TestCilindro {
    public static void main(String[] args) {
        //nuevo objeto de radio 5 y altura 10
        Cilindro cilindro1 = new Cilindro();
        cilindro1.setRadio(5);
        cilindro1.setAltura(10);
        //mostramos los datos del nuevo cilíndro
        System.out.printf("Altura: %d%n", cilindro1.getAltura());
        System.out.printf("Radio: %d%n", cilindro1.getRadio());
        System.out.printf("Superficie: %d%n", cilindro1.getSuperficie());
        System.out.printf("Volumen: %d%n", cilindro1.getVolumen());
        //Llamando al toString
        System.out.println(cilindro1);
        System.out.println("==========V1==============");
        CilindroV1 cilindro2 = new CilindroV1(7, 11);
        System.out.println(cilindro2);
        cilindro2.setAltura(10);  //actualizamos altura
        System.out.println(cilindro2);
        //trabajando con record
        System.out.println("==========V2 Record==========");
        CilindroV2 cilindro3 = new CilindroV2(8, 9);
        System.out.println(cilindro3);
        CilindroV2 cilindro4 = new CilindroV2(12);
        System.out.println(cilindro4);
        CilindroV2 cilindro5 = new CilindroV2();
        System.out.println(cilindro5);
        System.out.printf("CILINDRO: radio %d y altura %d%n",
                cilindro5.radio(), cilindro5.altura());
        //cilindro5.altura() = 45; no se puede hacer
        System.out.printf("Volumen %d y supercie %d%n",
                cilindro5.getVolumen(), cilindro5.getSuperficie());
    }
}
