package Model;

public abstract class Number{
    private String rawNum;
    private double num;
    private String size;
    private String rate;

    public Number(String rawNum) {
        this.rawNum = rawNum;
    }

    public void setRawNum(String rawNum){
        this.rawNum = rawNum;
    }

    public String getRawNum(){
        return rawNum;
    }

    public abstract int convertToDec();

    public double getNum(){ return num;}

    public void setNum(double num){
        this.num = num;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getRate(){
        return rate;
    }

    public void setRate(String rate){
        this.rate = rate;
    }
}
