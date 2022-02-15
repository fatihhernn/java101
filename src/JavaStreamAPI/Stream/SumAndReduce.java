package JavaStreamAPI.Stream;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(SumAndReduce.calculate2(numbers));
    }

    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    //reduce(BinaryOperator<T> accumulator)
    //BinaryOperator<T> extends BiFunction<T,T,T>
    // BinaryOperator => Represents an operation upon two operands of the same type, producing a result of the same type as the operands
    public static int calculate2(List<Integer> numbers) {
        return numbers.stream()
                .reduce((i,sum)->i+sum)
                .orElse(0);
    }
}
