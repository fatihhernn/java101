package EffectiveJava.Item34;

public enum  ExtendedOperation implements Operation{

    POWER("^"){
        @Override
        public double apply(double x, double y) {
            return Math.pow(x,y);
        }
    },
    REMAINDER("%"){
        @Override
        public double apply(double x, double y) {
            return x%y;
        }
    }

    ;

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String toString() {
        return symbol;
    }
}
