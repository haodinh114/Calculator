package YTesting;

import Controller.BinaryCalculator;
import Model.Binary;
import Model.Number;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest {

    public BinaryCalculatorTest(){

    }

    @Test
    public void BinTest() {
        BinaryCalculator newcal = new BinaryCalculator();
        Binary newBin1 = new Binary("10101010");
        Binary newBin2 = new Binary("10101010");

        Number addresult = newcal.add(newBin1, newBin2);
        assertEquals(new Binary("101010100"), addresult);
        System.out.println(addresult);

        Number subresult = newcal.subtract(newBin1, newBin2);
        assertEquals(new Binary("0"), subresult);
        System.out.println(subresult);

        Number mulresult = newcal.multiply(newBin1, newBin2);
        assertEquals(new Binary("111000011100100"), mulresult);
        System.out.println(mulresult);

        Number divresult = newcal.divide(newBin1, newBin2);
        assertEquals(new Binary("1"), divresult);
        System.out.println(divresult);

        String result = newcal.convertFromDec(150);
        assertEquals("10010110", result);
        System.out.println(result);

        int result1 = newcal.convertToDec("10010110");
        assertEquals(150, result1);
        System.out.println(result1);

    }

}