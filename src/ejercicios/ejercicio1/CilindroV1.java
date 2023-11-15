package ejercicios.ejercicio1;

public class CilindroV1 {
    private int radio;
    private int altura;

//NO LO PIDE EL EJERCICIO
    public CilindroV1(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }
    //NO LO PIDE EL EJERCICIO
    public CilindroV1(int altura) {
        /*radio = 5;
        this.altura = altura;*/
        this(5, altura);
    }
    public CilindroV1() {
        this(6, 6);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getSuperficie () {
        return (int) (2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2));
    }
    public int getVolumen () {
        return (int) (Math.PI * altura * radio * radio);
    }

    @Override
    public String toString() {
        return "CILÍNDRO: altura " + altura + ", radio " + radio +
                ", superficie " + getSuperficie() + ", volumen " + getVolumen();
    }
}
