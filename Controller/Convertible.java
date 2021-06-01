package Controller;

import Model.Number;

public interface Convertible {
    public int convertToDec(String num);

    public static String convertFromDec(int num) {
        return null;
    }

    public Number add(Number num1, Number num2);

    public Number subtract(Number num1, Number num2);

    public Number multiply(Number num1, Number num2);

    public Number divide(Number num1, Number num2);

}
