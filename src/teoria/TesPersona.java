package teoria;

public class TesPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan goytisolo", 25);
        System.out.print(persona1);
        persona1.setEdad(persona1.getEdad() + 1);//un año mas viejo
        System.out.print(persona1);
        persona1.setNombreCompleto("juani goytisolo"); //cambia la edad
        System.out.print(persona1);
        System.out.println("==========================");
        Persona persona2 = new Persona();
        persona2.setNombreCompleto("joaquin ariza");
        persona2.setEdad(17);
        System.out.print(persona2);
        persona2.setEdad(persona2.getEdad() + 5 ); //5 años después
        System.out.print(persona2);
        System.out.println("==========================");
        Persona persona3 = new Persona(5);
        System.out.print(persona3);
        persona3.setNombreCompleto("felisa rodríguez");
        System.out.print(persona3);
        System.out.println("------------------------");
        System.out.printf("¿Es mayor de edad %S? %B%n",
                persona1.getNombreCompleto(), persona1.esMayorDeEdad());
        System.out.printf("¿Es mayor de edad %S? %B%n",
                persona2.getNombreCompleto(), persona2.esMayorDeEdad());
        System.out.printf("¿Es mayor de edad %S? %B%n",
                persona3.getNombreCompleto(), persona3.esMayorDeEdad());
    }
}
