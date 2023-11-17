package teoria;
//java 3 * 2 y devuelve 6
//java 3 - 2 y devuelve 1
public class Argumentos {
    public static void main(String[] args) {
        //comprobar que llegan tres argumentos
        if (args.length != 3) {
            System.out.println("Faltan argumentos");
            //System.exit(1); //acaba el programa
            return;
        }
        System.out.println("leidos argumentos...");
        //convertirmos y creamos las variables
        int numero1     = Integer.parseInt(args[0]);
        String operador = args[1];
        int numero2     = Integer.parseInt(args[2]);
        //según el operador hacemos la operación
        switch (operador) {
            case "*" -> System.out.printf("%d %s %d = %d%n",
                            numero1, operador, numero2, (numero1 * numero2));
            case "/" -> System.out.printf("%d %s %d = %d%n",
                    numero1, operador, numero2, (numero1 / numero2));
            case "+" -> System.out.printf("%d %s %d = %d%n",
                    numero1, operador, numero2, (numero1 + numero2));
            case "-" -> System.out.printf("%d %s %d = %d%n",
                    numero1, operador, numero2, (numero1 - numero2));
            default -> System.out.printf("%s: operación no válida", operador);
        }
    }
}
