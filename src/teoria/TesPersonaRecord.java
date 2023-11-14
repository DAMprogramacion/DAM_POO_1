package teoria;

public class TesPersonaRecord {
    public static void main(String[] args) {
        PersonaRecord persona1 = new PersonaRecord(15, 62);
        System.out.println(persona1); //accediendo al toString()
        System.out.printf("PERSONA con edad %d y peso %.3f%n",
                persona1.edad(), persona1.peso()); //accedomos a los getters
        PersonaRecord persona2 =  new PersonaRecord(25);  //peso es 80
        System.out.println(persona2); //accediendo al toString()
        System.out.printf("PERSONA con edad %d y peso %.3f%n",
                persona2.edad(), persona2.peso()); //accedomos a los getters
        PersonaRecord persona3 = new PersonaRecord(); //edad 18 y  peso 80
        System.out.println(persona3); //accediendo al toString()
        System.out.printf("PERSONA con edad %d y peso %.3f%n",
                persona3.edad(), persona3.peso()); //accedomos a los getters
        System.out.println("=================================");
        System.out.printf("Persona 1 ¿Mayor de edad? %B%n", persona1.esMayorEdad());
        System.out.printf("Persona 2 ¿Mayor de edad? %B%n", persona2.esMayorEdad());
        System.out.printf("Persona 3 ¿Mayor de edad? %B%n", persona3.esMayorEdad());
        System.out.println("=================================");
        PersonaRecord persona4 = PersonaRecord.recienNacido(3.5F);
        System.out.println(persona4);
    }
}
