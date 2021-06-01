package Model;

public class Decimal extends Number{
    private String decNum;
    //private String decNum2;

    public Decimal(String decNum) {
        super(decNum);
    }

    public String getDecNum() {
        return decNum;
    }

    public void setDecNum(String decNum) {
        this.decNum = decNum;
    }

    public String toString(){
        return("Decimal number is: " + getDecNum());
    }

    @Override
    public int convertToDec() {
        return Integer.parseInt(decNum);
    }



    public static String convertFromDec(int num) {
        return null;
    }

}
