package YTesting;

import Controller.BWCalculator;
import Controller.HexadecimalCalculator;
import Model.Decimal;
import Model.Hexadecimal;
import Model.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BWCalculatorTest {
    public BWCalculatorTest() {

    }

    @Test
    public void BWTest() {
        BWCalculator newcal = new BWCalculator();

        String unitresult = newcal.UnitConvert(500.00, "Kilobits");
        assertEquals("500.0 KILOBIT is equivalent to any of the following: \n" +
                "500000.0 bits (b)\n" +
                "500.0 kb \n" +
                "0.5 mb \n" +
                "5.0E-4 gb \n" +
                "5.000000000000001E-7 tb \n" +
                "62500.0 byte \n" +
                "62.5 kbyte \n" +
                "0.0625 mbyte \n" +
                "6.25E-5 gbyte \n" +
                "6.250000000000001E-8 tbyte\n", unitresult);
        System.out.println(unitresult);

        double upAndDownBW = newcal.calculateUpAndDownBW(500.00, "Gigabytes", 5.00, "Mbit/s");
        assertEquals(800000, upAndDownBW);
        System.out.println("Download or upload time needed: " + upAndDownBW + " s");

        String webBW = newcal.calculateWebsiteBW(5000.00, "per day", 500.00, "KiloBytes", 2);
        assertEquals("3.456E9 Mbits/s or 1.135296E12 GB per month, with redundancy factor of 2", webBW);
        System.out.println(webBW);

        String monthlyUsageBW = newcal.MonthlyUsage(5000.00, "Terabytes", 4.00, "bit/s");
        assertEquals("5000.0 TERABYTE per month is equivalent to 1.0E10 BITPERSEC per second", monthlyUsageBW);
        System.out.println(monthlyUsageBW);

    }
}