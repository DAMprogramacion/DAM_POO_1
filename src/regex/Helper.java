package regex;

import java.time.LocalDate;
import java.util.Scanner;

public class Helper {
    public static Boolean validarFormatoDNI(String dni) {
        if (dni == null)
            return null;
        return dni.toLowerCase().matches("\\d{8}[a-hj-np-z]");
    }
    public static Boolean validarFormatoPasaporte(String pasaporte) {
        if (pasaporte == null)
            return null;
        return pasaporte.matches("[a-zA-Z]{3}[0-9]{6}");
    }
    public static Boolean validarIBAN(String iban) {
        if (iban == null)
            return null;
        String regexIban1 = "es[0-9]{20}";
        //"ES01 23 4567 8901 23 456789"
        String regexIban2 = "es[0-9]{2} [0-9]{2} [0-9]{4} [0-9]{4} [0-9]{2} [0-9]{6}";
        String regexIban3 = "es[0-9]{2}-[0-9]{2}-[0-9]{4}-[0-9]{4}-[0-9]{2}-[0-9]{6}";
        return iban.toLowerCase().matches(regexIban1 + "|" + regexIban2 + "|" + regexIban3);
    }
    public static Boolean validarNumeroTelefono(String numero) {
        if (numero == null)
            return null;
        //admitimos +34123.... +34 123...
        return numero.matches("(\\+34 ?)?[679][0-9]{8}");
    }
    public static Boolean validarFormatoCIF(String cif) {
        if (cif == null)
            return null;
        String caso1 = "[p-swn][0-9]{7}[a-z]";
        String caso2 = "[abeh][0-9]{8}";
        String caso3 = "[^p-swnabeh][0-9]{7}[0-9a-z]";
        return cif.toLowerCase().matches(caso1 + "|" + caso2 + "|" + caso3  );
    }
    public static Boolean validarDigitoControl(String cif) {
        return null;
    }
    public static Boolean validarCIF(String cif) {
        return validarFormatoCIF(cif) && validarDigitoControl(cif);
    }
    public static Boolean validarFechas(String fecha) {
        if (fecha == null)
            return null;
        boolean bisiesto = esBisiesto(fecha);
        String annos =  "(19[09]{2}|2[0-4][0-9]{2})";
        String mes31 = "(0?[1-9]|[12][0-9]|3[01])/(0?[13578]|1[02])/" + annos;
        String febreroBisiesto = "(0?[1-9]|[12][0-9])/0?2/" + annos;
        String febreroNoBisiesto = "(0?[1-9]|1[0-9]|2[0-8])/0?2/" + annos;
        String mes30 = "(0?[1-9]|[12][0-9]|30)/(0?[469]|11)/" + annos;
        if (bisiesto)
            return fecha.matches(mes31 + "|" + febreroBisiesto + "|" + mes30);
        return fecha.matches(mes31 + "|" + febreroNoBisiesto + "|" + mes30);
    }

    public static boolean esBisiesto(String fecha) {
        //    10/02/2000  10-02-2000 1-2-2001
        String anno = fecha.substring(fecha.length() - 4);
        if (! anno.matches("[0-9]+")) //doce/uno/mil novecientos
            return false;
        int iAnno = Integer.parseInt(anno);
        if ( iAnno % 4 != 0)
            return false;
        if ( anno.matches("[1-3][0-9]00"))
            return esFinDeSigloBisiesto(iAnno);
        return true;
    }

    public static boolean esFinDeSigloBisiesto(int iAnno) {
        String sAnno = iAnno + "";  //2000
        String dosCifras = sAnno.substring(0, 2);

        int iDosCifras = Integer.parseInt(dosCifras);
        return  iDosCifras % 4 == 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia = "", mes = "", anno = "", fecha = "";

        do {
            System.out.println("Introduce día: (1-31)");
            dia = scanner.nextLine();
            System.out.println("Introduce mes: (1-12)");
            mes = scanner.nextLine();
            System.out.println("Introduce año: (xxxx, ejemplo 2001)");
            anno = scanner.nextLine();
            fecha = dia + "/" + mes + "/" + anno;  //12/15/2000
        } while (! validarFechas(fecha));

        int iMes = Integer.parseInt(mes);
        int iDia = Integer.parseInt(dia);
        int iAnno = Integer.parseInt(anno);
        LocalDate date = LocalDate.of(iAnno, iMes, iDia);
        System.out.println(date);
    }
}
