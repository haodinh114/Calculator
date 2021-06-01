package Controller;

import Model.Frequency;
import Model.Rate;
import Model.Size;


public class BWCalculator {

    public String UnitConvert(double num, String unit){
        String res ="";

        //Unit:Bytes --> BYTE
        //Step 1: Change unit into a string that can be converted into an enum
        unit = unit.toUpperCase().replace("S","");

        //Step 2: Use value of to make enum

        Size enumUnit = Size.valueOf(unit);

                        res = (num + " " + enumUnit + " is equivalent to any of the following: \n"
                        + num * enumUnit.getValueBits() + " bits (b)\n"
                        + num * enumUnit.getValueKBits() + " kb \n"
                        + num * enumUnit.getValueMBits() + " mb \n"
                        + num * enumUnit.getValueGBits() + " gb \n"
                        + num * enumUnit.getValueTBits() + " tb \n"
                        + num * enumUnit.getValueByte() + " byte \n"
                        + num * enumUnit.getValueKByte() + " kbyte \n"
                        + num * enumUnit.getValueMByte() + " mbyte \n"
                        + num * enumUnit.getValueGByte() + " gbyte \n"
                        + num * enumUnit.getValueTByte() + " tbyte\n");

        return res;
    }

    public double calculateUpAndDownBW(double size, String unit1, double bandWidth, String unit2){
        double second;

        unit1 = unit1.toUpperCase().replace("S","");
        Size enumUnit = Size.valueOf(unit1);
        size = size * enumUnit.getValueBits();

        unit2 = unit2.toUpperCase().replace("/S","PERSEC");
        Rate enumRate = Rate.valueOf(unit2);
        bandWidth = bandWidth * enumRate.getValueBitsPerSec();


        second = (size / bandWidth);
        return second;
    }

    public String calculateWebsiteBW( double view, String unit1, double size, String unit2, int redundancy){

        unit1 = unit1.toUpperCase().replace("PER ","");
        Frequency enumRate = Frequency.valueOf(unit1);
        view = view * enumRate.getValueSecond();

        unit2 = unit2.toUpperCase().replace("S","");
        Size enumUnit = Size.valueOf(unit2);
        size = size * enumUnit.getValueMBits();

        double BWMbitPerSec = (view * size * redundancy);
        double MWGBPerMonth = BWMbitPerSec * 328.500;
        return(BWMbitPerSec + " Mbits/s or " + MWGBPerMonth + " GB per month, with redundancy factor of " + redundancy);
    }

    public String MonthlyUsage(double size, String unit1, double bandWidth, String unit2){

        unit2 = unit2.toUpperCase().replace("/S","PERSEC");
        Rate enumRate = Rate.valueOf(unit2);

        bandWidth = bandWidth * enumRate.getValueBitsPerSec();

        unit1 = unit1.toUpperCase().replace("S","");
        Size enumUnit = Size.valueOf(unit1);

        double size1 = size * enumUnit.getValueMBits();

        double res = size1/bandWidth;

        String result = size + " " + unit1 + " per month is equivalent to " + res + " " + unit2 + " per second";

        return result;
    }

}
