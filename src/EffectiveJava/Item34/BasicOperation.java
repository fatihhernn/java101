package EffectiveJava.Item34;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum BasicOperation implements Operation {

    PLUS("+"){
        @Override
        public double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS("-"){
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    },
    TIMES("*"){
        @Override
        public double apply(double x, double y) {
            return x*y;
        }
    },
    DIVIDE("/"){
        @Override
        public double apply(double x, double y) {
            return x/y;
        }
    }

    ;
    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }


    private static final Map<String,BasicOperation> stringToEnum= Stream.of(values())
            .collect(toMap(Objects::toString,e->e));

    private static Optional<BasicOperation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static void main(String[] args) {
        double x=2;
        double y=4;

        test(Arrays.asList(ExtendedOperation.values()), x,y);
    }

    private static void test(Collection<? extends Operation> opSet,double x,double y){
        for (Operation op:opSet){
            System.out.printf("%f %s %f = %f%n", x , op, y, op.apply(x,y));
        }
    }

}
