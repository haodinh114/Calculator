package Model;

public enum Size {
    BIT(1, 0.001, 1e-6, 1e-9, 1e-12, 0.125, 0.000125, 1.25e-6, 1.25e-10, 1.25e-13),
    KILOBIT(1000, 1, 0.001, 1e-6, 1e-9, 125, 0.125, 0.000125, 1.25e-7, 1.25e-10),
    MEGABIT(1e6, 1000, 1, 0.001, 1e-6, 125000, 125, 0.125, 0.000125, 1.25e-7),
    GIGABIT(1e9, 1e6, 1000, 1, 0.001, 1e-6, 125000, 125, 0.125, 0.000125),
    TERABIT(1e12, 1e9, 1e6, 1000, 1, 0.001, 1e-6, 125000, 125, 0.125),
    BYTE(8, 0.008, 8e-6, 8e-9, 8e-12, 1, 0.0001, 1e-6, 1e-9, 1e-12),
    KILOBYTE(8000, 8, 0.008, 8e-6, 8e-9, 8e-12, 1, 0.0001, 1e-6, 1e-9),
    MEGABYTE(8e6, 8000, 8, 0.008, 8e-6, 8e-9, 8e-12, 1, 0.0001, 1e-6),
    GIGABYTE(8e9, 8e6, 8000, 8, 0.008, 8e-6, 8e-9, 8e-12, 1, 0.0001),
    TERABYTE(8e12, 8e9, 8e6, 8000, 8, 0.008, 8e-6, 8e-9, 8e-12, 1);

    private final double valueBits;
    private final double valueKBits;
    private final double valueMBits;
    private final double valueGBits;
    private final double valueTBits;
    private final double valueByte;
    private final double valueKByte;
    private final double valueMByte;
    private final double valueGByte;
    private final double valueTByte;

    Size(double valueBits, double valueKBits, double valueMBits, double valueGBits, double valueTBits,
         double valueByte, double valueKByte, double valueMByte, double valueGByte, double valueTByte) {
        this.valueBits = valueBits;
        this.valueGBits = valueGBits;
        this.valueKBits = valueKBits;
        this.valueMBits = valueMBits;
        this.valueTBits = valueTBits;
        this.valueByte = valueByte;
        this.valueGByte = valueGByte;
        this.valueMByte = valueMByte;
        this.valueKByte = valueKByte;
        this.valueTByte = valueTByte;
    }

    public double getValueBits() {
        return valueBits;
    }

    public double getValueGBits() {
        return valueGBits;
    }

    public double getValueMBits() {
        return valueMBits;
    }

    public double getValueKBits() {
        return valueKBits;
    }

    public double getValueTBits() {
        return valueTBits;
    }

    public double getValueKByte() {
        return valueKByte;
    }

    public double getValueMByte() {
        return valueMByte;
    }

    public double getValueGByte() {
        return valueGByte;
    }

    public double getValueTByte() {
        return valueTByte;
    }

    public double getValueByte() {
        return valueByte;
    }
}

