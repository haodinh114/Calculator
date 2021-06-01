package Model;


    public enum Rate {
        BITPERSEC(1, 0.001, 1e-6, 1e-9, 1e-12),
        KBITPERSEC(1000, 1, 0.001, 1e-6, 1e-9),
        MBITPERSEC(1e6, 1000, 1, 0.001, 1e-6),
        GBITPERSEC(1e9, 1e6, 1000, 1, 0.001),
        TBITPERSEC(1e12, 1e9, 1e6, 1000, 1);


        private final double valueBitsPerSec;
        private final double valueKBitsPerSec;
        private final double valueMBitsPerSec;
        private final double valueGBitsPerSec;
        private final double valueTBitsPerSec;

        Rate(double valueBitsPerSec, double valueGBitsPerSec, double valueKBitsPerSec, double valueMBitsPerSec, double valueTBitsPerSec) {
            this.valueBitsPerSec = valueBitsPerSec;
            this.valueGBitsPerSec = valueGBitsPerSec;
            this.valueKBitsPerSec = valueKBitsPerSec;
            this.valueMBitsPerSec = valueMBitsPerSec;
            this.valueTBitsPerSec = valueTBitsPerSec;
        }

        public double getValueBitsPerSec() {
            return valueBitsPerSec;
        }

        public double getValueGBitsPerSec() {
            return valueGBitsPerSec;
        }

        public double getValueMBitsPerSec() {
            return valueMBitsPerSec;
        }

        public double getValueKBitsPerSec() {
            return valueKBitsPerSec;
        }

        public double getValueTBitsPerSec() {
            return valueTBitsPerSec;
        }
    }


