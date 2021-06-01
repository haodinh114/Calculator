package Model;

public class Hexadecimal extends Number {
    private String hexNum;
    //private String decNum2;

    public Hexadecimal(String hexNum) {

        super(hexNum);
        this.hexNum = hexNum;
    }

    public String getHexNum() {
        return this.hexNum;
    }

    public void setHexNum(String hexNum) {
        this.hexNum = hexNum;
    }

    @Override
    public int convertToDec(){
        String s = "";
        String digits = "0123456789ABCDEF"; //the range
        s = this.hexNum.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

//    private String getHexnum() {
//    }

    //@Override
    public static String convertFromDec(int d){

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

    public String toString(){
        return("Hexadecimal number is: " + getHexNum()); // + ", convert to Dec " + convertToDec() + ", convert to Hex " + convertFromDec(Number hexNum));
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Hexadecimal)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Hexadecimal c = (Hexadecimal) o;

        // Compare the data members and return accordingly
        return c.hexNum.equals(this.hexNum) ;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
