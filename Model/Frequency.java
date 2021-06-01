package Model;

public enum Frequency {
    SECOND(1, 0.01667, 0.000278, 0.00001157, 0.000001653, 3.805e-7, 3.17e-8),
    MINUTE(60, 1, 0.0167,0.0006945, 0.0000992,0.0000228,0.0000019),
    HOUR(3600,60, 1,0.041667,0.00595,0.001369,0.000114),
    DAY(86400,1440,24,1,0.14285,0.03287,0.002739),
    WEEK(604800,10080,168,7,1,0.23013,0.01917),
    MONTH(2628000, 43800, 730.001,30.4167,4.34524,1,0.083334),
    YEAR(31540000, 525600,8760,365,52.1429,12,1);

    private final double valueSecond;
    private final double valueMinute;
    private final double valueHour;
    private final double valueDay;
    private final double valueWeek;
    private final double valueMonth;
    private final double valueYear;

   Frequency (double valueSecond, double valueMinute, double valueHour, double valueDay, double valueWeek,
         double valueMonth, double valueYear){
        this.valueSecond = valueSecond;
        this.valueMinute = valueMinute;
        this.valueHour = valueHour;
        this.valueDay = valueDay;
        this.valueWeek = valueWeek;
        this.valueMonth = valueMonth;
        this.valueYear = valueYear;
    }


    public double getValueSecond(){
        return valueSecond;
    }

    public double getValueMinute(){
        return valueMinute;
    }

    public double getValueHour(){
        return valueHour;
    }

    public double getValueDay(){
        return valueDay;
    }

    public double getValueMonth(){
        return valueMonth;
    }

    public double getValueYear() {
        return valueYear;
    }

    public double getValueWeek() {
        return valueWeek;
    }


}
//    public enum Frequency {
//        SECOND(1),
//        MINUTE(60),
//        HOUR(3600),
//        DAY(86400),
//        WEEK(604800),
//        MONTH(2.628e+6),
//        YEAR(3.154e+7);
//
//        private final double freq;
//        Frequency(double freq){
//            this.freq = freq;
//        }
//
//        public double getFreq(){
//            return freq;
//        }
//    }




