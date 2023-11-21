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
        assertTrue(Helper.validarIBAN("es0123456789123456789"));
        assertTrue(Helper.validarIBAN("ES123456789123456789"));

    }
}