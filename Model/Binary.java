package Model;


public class Binary extends Number {
    private String binNum;

    public Binary(String binNum) {
        super(binNum);
        this.binNum = binNum;
    }

    public String getBinNum() {
        return this.binNum;
    }

    public void setBinNum(String binNum) {
        this.binNum = binNum;
    }

    @Override
    public int convertToDec(){

        char[] numbers = getBinNum().toCharArray();
        int result = 0;
        //Whenever the number has "1", multiply the digit the proper base
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == '1') {
                result += Math.pow(2, (numbers.length - i - 1));
            }
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

    public String toString(){
        return("Binary number is: " + getBinNum()); //+ ", convert to Dec " + convertToDec() + ", convert to Bin " + convertFromDec();
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Binary)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Binary c = (Binary) o;

        // Compare the data members and return accordingly
        return c.binNum.equals(this.binNum) ;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

