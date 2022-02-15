package EffectiveJava.Item34;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum Operation {

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

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x,double y);

    private static final Map<String,Operation> stringToEnum= Stream.of(values())
            .collect(toMap(Objects::toString,e->e));

    private static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static void main(String[] args) {
        double x=2;
        double y=4;

        for (Operation op : Operation.values()){
            System.out.printf("%f %s %f = %f%n", x , op, y, op.apply(x,y));
        }
        System.out.println(Operation.fromString(""));
    }

}
