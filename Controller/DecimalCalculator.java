package Controller;
import Model.Decimal;
import Model.Number;

public class DecimalCalculator extends Calculator implements Convertible{
    public DecimalCalculator() {
        super();
    }

    @Override
    public int convertToDec(String num) {
        return 0;
    }


    @Override
    public Number add(Number num1, Number num2){
        int decNum1 = (int) num1.getNum();
        int decNum2 = (int) num2.getNum();
        int sum = (decNum1 + decNum2);
        String res = Integer.toString(sum);
        Decimal obj = new Decimal(res);
        return obj;
    }

    @Override
    public Number subtract(Number num1, Number num2){
        int decNum1 = num1.convertToDec();
        int decNum2 = num2.convertToDec();
        int dif = (decNum1 - decNum2);
        String res = Integer.toString(dif);
        Decimal obj = new Decimal(res);
        return obj;
    }

    @Override
    public Number multiply(Number num1, Number num2){
        int decNum1 = num1.convertToDec();
        int decNum2 = num2.convertToDec();
        int mul = (decNum1 * decNum2);
        String res = Integer.toString(mul);
        Decimal obj = new Decimal(res);
        return obj;
    }

    @Override
    public Number divide(Number num1, Number num2){
        int decNum1 = num1.convertToDec();
        int decNum2 = num2.convertToDec();
        int div = (decNum1 / decNum2);
        String res = Integer.toString(div);
        Decimal obj = new Decimal(res);
        return obj;
    }

}
