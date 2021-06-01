package Controller;
import Model.Binary;
import Model.Number;

public class BinaryCalculator extends Calculator implements Convertible{

    public BinaryCalculator(){
        super();
    }

    public int convertToDec(String binary){
        //String binary = "";
        char[] numbers = binary.toCharArray();
        int result = 0;
        //Whenever the number has "1", multiply the digit the proper base
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == '1')
                result += Math.pow(2, (numbers.length - i - 1));
        }
        return result;
    }

    public static String convertFromDec(int num){
        // handle case where number is negative

        String start = "";
        if (num < 0) {
            start = "-";
            num = -num;

        }

        // Checks to make sure the numerical value is greater than 0
        // otherwise it can't be displayed in binary so returns 0
        if (num <= 0) {
            return "0";
        }
        int[] binary = new int[16];
        int index = 0;
        while (num > 0) {
            binary[index] = num % 2;
            num = num / 2;
            index++;
        }
        String binaryOutput = "";
        for (int i = index - 1; i >= 0; i--) {
            binaryOutput += binary[i];
        }
        return binaryOutput;
    }

    @Override
    public Number add(Number num1, Number num2){
        int binNum1 = num1.convertToDec();
        int binNum2 = num2.convertToDec();
        String res = "";
        int sum = (binNum1 + binNum2);
        res = Binary.convertFromDec(sum);
        Binary obj = new Binary(res);
        return obj;
    }

    @Override
    public Number subtract(Number num1, Number num2){
        int binNum1 = num1.convertToDec();
        int binNum2 = num2.convertToDec();
        String res = "";
        int dif = (binNum1 - binNum2);
        res = Binary.convertFromDec(dif);
        Binary obj = new Binary(res);
        return obj;
    }

    @Override
    public Number multiply(Number num1, Number num2){
        int binNum1 = num1.convertToDec();
        int binNum2 = num2.convertToDec();
        String res = "";
        int mul = (binNum1 * binNum2);
        res = Binary.convertFromDec(mul);
        Binary obj = new Binary(res);
        return obj;
    }

    @Override
    public Number divide(Number num1, Number num2){
        int binNum1 = num1.convertToDec();
        int binNum2 = num2.convertToDec();
        String res = "";
        int div = (binNum1 / binNum2);
        res = Binary.convertFromDec(div);
        Binary obj = new Binary(res);
        return obj;
    }

}
