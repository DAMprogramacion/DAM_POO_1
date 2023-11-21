package regex;

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
        return iban.toLowerCase().matches("es[0-9]{2}[ -]?[0-9]{18}");
    }
}
