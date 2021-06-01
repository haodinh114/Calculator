package Controller;
import Model.Hexadecimal;
import Model.Number;

/**
 *
 */
public class HexadecimalCalculator extends Calculator implements Convertible{
    public HexadecimalCalculator(){
        super();
    }

    public int convertToDec(String s) {
        //InputUser rawHex = new InputUser();
        String digits = "0123456789ABCDEF"; //the range
        //String s = "";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static String convertFromDec(int d) {
        String digits = "0123456789ABCDEF"; //the range
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;                // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / 16;
        }
        return hex;
    }

    @Override
    public Number add(Number num1, Number num2){
        int hexNum1 = num1.convertToDec();
        int hexNum2 = num2.convertToDec();
        String res = "";
        int sum = (hexNum1 + hexNum2);
        res = Hexadecimal.convertFromDec(sum);
        Hexadecimal obj = new Hexadecimal(res);
        return obj;
    }

    @Override
    public Number subtract(Number num1, Number num2){
        int hexNum1 = num1.convertToDec();
        int hexNum2 = num2.convertToDec();
        String res = "";
        int dif = (hexNum1 - hexNum2);
        res = Hexadecimal.convertFromDec(dif);
        Hexadecimal obj = new Hexadecimal(res);
        return obj;
    }

    @Override
    public Number multiply(Number num1, Number num2){
        int hexNum1 = num1.convertToDec();
        int hexNum2 = num2.convertToDec();
        String res = "";
        int mul = (hexNum1 * hexNum2);
        res = Hexadecimal.convertFromDec(mul);
        Hexadecimal obj = new Hexadecimal(res);
        return obj;
    }

    @Override
    public Number divide(Number num1, Number num2){
        int hexNum1 = num1.convertToDec();
        int hexNum2 = num2.convertToDec();
        String res = "";
        if(hexNum2 == 0){
            return null;
        } else {
            int div = (hexNum1 / hexNum2);
            res = Hexadecimal.convertFromDec(div);
        }

        Hexadecimal obj = new Hexadecimal(res);
        return obj;

    }

}
