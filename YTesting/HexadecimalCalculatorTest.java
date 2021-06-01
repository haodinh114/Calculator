package YTesting;

import Controller.HexadecimalCalculator;
import Model.Binary;
import Model.Hexadecimal;
import Model.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalCalculatorTest {
    public HexadecimalCalculatorTest() {

    }

    @Test
    public void HexTest() {
        HexadecimalCalculator newcal = new HexadecimalCalculator();
        Hexadecimal newHex1 = new Hexadecimal("8ABE");
        Hexadecimal newHex2 = new Hexadecimal("B78");

        Number addresult = newcal.add(newHex1, newHex2);
        assertEquals(new Hexadecimal("9636"), addresult);
        System.out.println(addresult);

        Number subresult = newcal.subtract(newHex1, newHex2);
        assertEquals(new Hexadecimal("7F46"), subresult);
        System.out.println(subresult);

        Number mulresult = newcal.multiply(newHex1, newHex2);
        assertEquals(new Hexadecimal("6373310"), mulresult);
        System.out.println(mulresult);

        Number divresult = newcal.divide(newHex1, newHex2);
        assertEquals(new Hexadecimal("C"), divresult);
        System.out.println(divresult);

        String result = newcal.convertFromDec(170);
        assertEquals("AA", result);
        System.out.println(result);

        int result1 = newcal.convertToDec("DAD");
        assertEquals(3501, result1);
        System.out.println(result1);

    }
}