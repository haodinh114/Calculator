package Model;

public abstract class Unit {
    private String rawUnit;
    private long rawValue;

    public Unit( long rawValue, String rawUnit){
        this.rawUnit = rawUnit;
        this.rawValue = rawValue;
    }

    public String getRawUnit(){
        return rawUnit;
    }

    public void setRawUnit(String rawUnit){
        this.rawUnit = rawUnit;
    }

    public double getRawValue() {
        return rawValue;
    }

    public void setRawValue(long rawValue) {
        this.rawValue = rawValue;
    }



}
