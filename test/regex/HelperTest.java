package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    void validarDNI() {
        assertNull(Helper.validarFormatoDNI(null));
        assertTrue(Helper.validarFormatoDNI("12345678a"));
        assertTrue(Helper.validarFormatoDNI("12345678A"));
        assertFalse(Helper.validarFormatoDNI("12345678i"));
        assertFalse(Helper.validarFormatoDNI("2345678i"));
        assertFalse(Helper.validarFormatoDNI("12345678ab"));
        assertFalse(Helper.validarFormatoDNI("123456789a"));
    }

    @Test
    void validarFormatoPasaporte() {
        assertNull(Helper.validarFormatoPasaporte(null));
        assertTrue(Helper.validarFormatoPasaporte("ABC123456"));
        assertTrue(Helper.validarFormatoPasaporte("abc123456"));
        assertFalse(Helper.validarFormatoPasaporte("ABCD23456"));
        assertFalse(Helper.validarFormatoPasaporte("ABCD23456"));
        assertFalse(Helper.validarFormatoPasaporte("AB0123456"));
        assertFalse(Helper.validarFormatoPasaporte("ABC1234567"));
        assertFalse(Helper.validarFormatoPasaporte("AB123456F"));

    }

    @Test
    void validarIBAN() {
        assertNull(Helper.validarIBAN(null));
        assertTrue(Helper.validarIBAN("es01234567890123456789"));
        assertTrue(Helper.validarIBAN("ES01234567890123456789"));
        assertFalse(Helper.validarIBAN("ES0123456789012345678"));
        assertTrue(Helper.validarIBAN("ES01 23 4567 8901 23 456789"));
        assertFalse(Helper.validarIBAN("ES1 23 4567 8901 23 456789"));
        assertTrue(Helper.validarIBAN("ES01-23-4567-8901-23-456789"));
        assertFalse(Helper.validarIBAN("ES1-23-4567-8901-23-456789"));
        assertFalse(Helper.validarIBAN("ES10 23-4567-8901 23-456789"));
        assertFalse(Helper.validarIBAN("ES10-234564890123-456789"));
    }

    @Test
    void validarNumeroTelefono() {
        assertNull(Helper.validarNumeroTelefono(null));
        assertTrue(Helper.validarNumeroTelefono("666123456"));
        assertTrue(Helper.validarNumeroTelefono("766123456"));
        assertTrue(Helper.validarNumeroTelefono("966123456"));
        assertFalse(Helper.validarNumeroTelefono("66612345"));
        assertFalse(Helper.validarNumeroTelefono("866612345"));
        assertTrue(Helper.validarNumeroTelefono("+34766123456"));
        assertTrue(Helper.validarNumeroTelefono("+34 766123456"));
    }

    @Test
    void validarFormatoCIF() {
        assertNull(Helper.validarFormatoCIF(null));
        assertTrue(Helper.validarFormatoCIF("A58818501"));
        assertTrue(Helper.validarFormatoCIF("a58818501"));
        assertFalse(Helper.validarFormatoCIF("A5881850a"));
        assertTrue(Helper.validarFormatoCIF("p5881850a"));
        assertFalse(Helper.validarFormatoCIF("p58818501"));
        assertTrue(Helper.validarFormatoCIF("l5881850a"));
        assertTrue(Helper.validarFormatoCIF("l58818501"));
        assertFalse(Helper.validarFormatoCIF("l5881850a1"));
        assertFalse(Helper.validarFormatoCIF("l588185011"));
    }

    @Test
    void validarFechas() {
        assertNull(Helper.validarFechas(null));
        assertFalse(Helper.validarFechas("55/10/2000"));
        assertFalse(Helper.validarFechas("35/10/2000"));
        assertFalse(Helper.validarFechas("0/10/2000"));
        assertTrue(Helper.validarFechas("15/10/2000"));
        assertTrue(Helper.validarFechas("15/1/2000"));
        assertTrue(Helper.validarFechas("15/01/2000"));
        assertTrue(Helper.validarFechas("07/01/2000"));
        assertFalse(Helper.validarFechas("15/13/2000"));
        assertTrue(Helper.validarFechas("31/02/2000"));
        assertTrue(Helper.validarFechas("31/02/1999"));
        assertFalse(Helper.validarFechas("31/02/1899"));
        assertFalse(Helper.validarFechas("31/02/3000"));
    }
}