package net.xeric.demos.services;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by markshead on 6/14/18.
 */
public class ConverterServiceTest {
    ConverterService converterService = new ConverterService();


    /* Just to keep Junit from complaining when there are no other tests */
    @Test
    public void testTrivial() {
        assertTrue(true);
    }

/*
    @Test
    public void testRomanNumeral_I_to_X() {
        assertEquals("I", converterService.convert(1));
        assertEquals("II", converterService.convert(2));
        assertEquals("III", converterService.convert(3));
        assertEquals("IV", converterService.convert(4));

        assertEquals("V", converterService.convert(5));
        assertEquals("VI", converterService.convert(6));
        assertEquals("VII", converterService.convert(7));
        assertEquals("VIII", converterService.convert(8));
        assertEquals("IX", converterService.convert(9));
        assertEquals("X", converterService.convert(10));

    }
 */



 /*

    @Test
    public void testRomanNumeral_XI_to_XXIX() {
        assertEquals("XI", converterService.convert(11));
        assertEquals("XII", converterService.convert(12));
        assertEquals("XIII", converterService.convert(13));
        assertEquals("XIV", converterService.convert(14));
        assertEquals("XV", converterService.convert(15));
        assertEquals("XVI", converterService.convert(16));
        assertEquals("XVII", converterService.convert(17));
        assertEquals("XVIII", converterService.convert(18));
        assertEquals("XIX", converterService.convert(19));
        assertEquals("XX", converterService.convert(20));
        assertEquals("XXI", converterService.convert(21));
        assertEquals("XXII", converterService.convert(22));
        assertEquals("XXIII", converterService.convert(23));
        assertEquals("XXIV", converterService.convert(24));
        assertEquals("XXV", converterService.convert(25));
        assertEquals("XXVI", converterService.convert(26));
        assertEquals("XXVII", converterService.convert(27));
        assertEquals("XXVIII", converterService.convert(28));
        assertEquals("XXIX", converterService.convert(29));
        assertEquals("XXX", converterService.convert(30));
        assertEquals("XXXI", converterService.convert(31));
        assertEquals("XXXII", converterService.convert(32));
        assertEquals("XXXIII", converterService.convert(33));
        assertEquals("XXXIV", converterService.convert(34));
        assertEquals("XXXV", converterService.convert(35));
        assertEquals("XXXVI", converterService.convert(36));
        assertEquals("XXXVII", converterService.convert(37));
        assertEquals("XXXVIII", converterService.convert(38));
        assertEquals("XXXIX", converterService.convert(39));
    }
    */


 /*
    @Test
    public void testRomanNumeral_XL_and_up() {
        assertEquals("XL", converterService.convert(40));
        assertEquals("XLI", converterService.convert(41));
        assertEquals("XLII", converterService.convert(42));
        assertEquals("XLIII", converterService.convert(43));
        assertEquals("XLIV", converterService.convert(44));
        assertEquals("XLV", converterService.convert(45));

        assertEquals("XC", converterService.convert(90));
        assertEquals("XCIV", converterService.convert(94));
        assertEquals("CD", converterService.convert(400));
        assertEquals("D", converterService.convert(500));
        assertEquals("CM", converterService.convert(900));
        assertEquals("M", converterService.convert(1000));
        assertEquals("MMMCMXCIX", converterService.convert(3999));
    }
*/

}
