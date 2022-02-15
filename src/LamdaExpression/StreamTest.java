package LamdaExpression;

import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) {
        Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9})
                .filter(x->x%2==0)
                .map(n->n*n)
                .average()
                .ifPresent(System.out::println);
    }
}
