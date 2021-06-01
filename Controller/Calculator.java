package Controller;
import Model.Number;

public abstract class Calculator implements Convertible{

    public Calculator() {

    }

    //Binary(010101001).convertToDec --> 63 int or Decimal(63)
    public abstract int convertToDec(String num);

    public static String convertFromDec(int num) {
        return null;
    }

    public abstract Number add(Number num1, Number num2);

    public abstract Number subtract(Number num1, Number num2);

    public abstract Number multiply(Number num1, Number num2);

    public abstract Number divide(Number num1, Number num2);

}
