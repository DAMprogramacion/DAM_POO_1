package ejercicios.ejercicio1;
//NO LO PIDE EL EJERCICIO
public record CilindroV2(int radio, int altura) {
    public CilindroV2(int altura) { //siempre el radio será 5
        this(5, altura);      //se puede establecer la altura
    }
    public CilindroV2() { //simpre de radio 5 y siempre altura 5
        //this(5,5);
        this(5);
    }
    public int getSuperficie () {
        return (int) (2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2));
    }
    public int getVolumen () {
        return (int) (Math.PI * altura * radio * radio);
    }
}
