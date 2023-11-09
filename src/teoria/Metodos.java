package teoria;

public class Metodos {
    //SOBRECARGA DE MÉTODOS
    public static int sumarValores(int uno, int dos) {
        System.out.println("llamando método 1");
        return uno + dos;
    }
    public static int sumarValores(int uno) {
        System.out.println("llamando método 2");
        return uno;
    }
    public static int sumarValores(double uno, double dos) {
        System.out.println("llamando método 3");
        return (int) (uno + dos);
    }
    public static int sumarValores(double uno, int dos) {
        System.out.println("llamando método 4");
        return (int) (uno + dos);
    }
    /*public static double sumarValores(double uno, int dos) {
        System.out.println("llamando método 4");
        return uno + dos;
    }*/  //NO PUEDE SER, AMBIGÜEDAD, NO SABRIAMOS A QUIEN LLAMAR
    public static void main(String... args) { //lista dinámica de parámetros
        int resultado = sumarValores(3);
        System.out.println("Resultado: " + resultado);
        resultado = sumarValores(3, 2);
        System.out.println("Resultado: " + resultado);
        resultado = sumarValores(3.3, 2);
        System.out.println("Resultado: " + resultado);
    }
}
